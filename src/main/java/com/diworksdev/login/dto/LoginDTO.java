package com.diworksdev.login.dto;

public class LoginDTO {
	private int id;    //テーブルから取得するデータに対応したフィールド変数を宣言
	private String name;
	private String password;
	
	public int getId() {   //Actionから呼び出されたidフィールドの値をActionに渡す
		return id;
	}
	public void setId(int id) {  //DAOから受け取って値を自身のidフィールドに格納
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
