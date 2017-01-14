package com.tcs.banking.insurance.users.helper;

import com.tcs.banking.insurance.users.dao.UserDAO;
import com.tcs.banking.insurance.users.dto.UserDTO;

public class UserHelper {
	// String name = "    Amit     Srivastava     ";
	public boolean validate(UserDTO userDTO){
		boolean isValidate  = false;
		if(userDTO.getUserid().trim().length()>0
				&& userDTO.getPassword().trim().length()>0){
			isValidate = true;
		}
		return isValidate;
		
	}
	
	public UserDTO isUserExist(UserDTO userDTO){
		if(validate(userDTO)){
			UserDAO userDAO = new UserDAO();
			userDTO = userDAO.authenticateUser(userDTO);
		}
		else
		{
			userDTO.setMessage("Validation Fail....");
		}
		return userDTO;
	}

}
