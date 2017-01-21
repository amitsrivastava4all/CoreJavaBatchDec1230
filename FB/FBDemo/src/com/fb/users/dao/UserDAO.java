package com.fb.users.dao;

import com.fb.users.dto.UserDTO;

public class UserDAO {
	int currentIndex = 0;
	UserDTO userArray[] = new UserDTO[5];
	private static UserDAO object ;
	private UserDAO(){}
	public static UserDAO getObject(){
		if(object == null){
			object = new UserDAO();
		}
		return object;
	}
	public boolean isAuth(UserDTO userDTO){
		boolean isFound = false;
		if(userArray.length>0){
			for(UserDTO user: userArray){
				if(user!=null){
				if(userDTO.getUserid().equals(user.getUserid())
						&& userDTO.getPassword().equals(user.getPassword())){
					isFound = true;
					break;
				}
				}
			}
		}
		return isFound;
	}
	public boolean register(UserDTO userDTO){
		boolean isRegister = false;
		if(currentIndex<userArray.length){
			userArray[currentIndex] = userDTO;
			currentIndex++;
			isRegister = true;
		}
		return isRegister;
	}
}
