package com.tcs.banking.insurance.users.dto;

public class UserDTO {
	private String userid;
	private String password;
	private String pinCode;
	private String message;
	public UserDTO(){}
	public UserDTO(String userid, String password, String pinCode){
		this.userid = userid;
		this.password = password;
		this.pinCode = pinCode;
	}
	
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
