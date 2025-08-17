package com.diworksdev.login.action;
import java.sql.SQLException;

import com.diworksdev.login.dao.LoginDAO;
import com.diworksdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String name;  //JSPから受け取る値必ず一緒
	private String password;
	
	public String execute() throws SQLException {
		String ret = ERROR;  //メソッドの戻り値	ret定義。初期値をエラー
		
		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();
		
		dto = dao.select(name,password);  //LoginDAOクラスのselectメソッドを呼び出しDAOで取得した結果をLoginDTOに代入し
		
		if(name.equals(dto.getName())) {  //DTOから戻ってきた値が一致するか確認
			if(password.equals(dto.getPassword())){
				ret = SUCCESS ;  //if条件満たしたらSUCCESSに書き換え
			}
		}
		return ret; 
	}
	public String getName() {
		return name;
	} 
	public void setName(String name) {  //set定義でJSPで入力した値がそれぞれのフィールド変数に格納
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password; 
	}

}
