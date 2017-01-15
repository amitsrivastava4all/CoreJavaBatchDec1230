package com.tcs.banking.insurance.users.helper;

import com.tcs.banking.insurance.users.dao.UserDAO;
import com.tcs.banking.insurance.users.dto.MessageDTO;
import com.tcs.banking.insurance.users.dto.UserDTO;

public class UserHelper extends UserDAO {
	// String name = "    Amit     Srivastava     ";
	public boolean validate(UserDTO userDTO){
		boolean isValidate  = false;
		if(userDTO.getUserid().trim().length()>0
				&& userDTO.getPassword().trim().length()>0
				&& userDTO.getPinCode().trim().length()>=4 
				&& userDTO.getPinCode().trim().length()<=8
				){
			isValidate = true;
		}
		return isValidate;
		
	}
	
	public MessageDTO isUserExist(UserDTO userDTO){
		
		if(validate(userDTO)){
			UserDAO userDAO = new UserDAO();
			return super.authenticateUser(userDTO);  
			//return userDAO.authenticateUser(userDTO);
		}
		else
		{
			MessageDTO messageDTO = new MessageDTO();
			messageDTO.setMessage("Validation Fail....");
			messageDTO.setStatus("VALID_FAIL");
			return messageDTO;
			//userDTO.setMessage("Validation Fail....");
		}
		
		//return userDTO;
	}

}
