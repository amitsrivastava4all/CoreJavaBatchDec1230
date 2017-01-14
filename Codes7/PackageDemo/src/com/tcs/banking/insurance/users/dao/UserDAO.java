package com.tcs.banking.insurance.users.dao;

import com.tcs.banking.insurance.users.dto.UserDTO;

public class UserDAO {
	
	public UserDTO authenticateUser(UserDTO userDTO){
		String message = "Invalid Userid or password";
		if(userDTO.getUserid().equals("amit") 
				&& userDTO.getPassword().equals("123")){
			message = "Welcome "+userDTO.getUserid();
		}
		userDTO.setMessage(message);
		return userDTO;
		
	}

}
