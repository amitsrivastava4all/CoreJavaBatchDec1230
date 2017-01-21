package com.fb.users.helper;

import static com.fb.utils.CommonValidation.isCorrectLength;
import static com.fb.utils.CommonValidation.isBlank;

import com.fb.users.dao.UserDAO;
import com.fb.users.dto.UserDTO;
public class UserHelper {
	
	public String doRegister(UserDTO userDTO){
		if(isValid(userDTO)){
			UserDAO userDAO = UserDAO.getObject();
			//UserDAO userDAO = new UserDAO();
			if(userDAO.register(userDTO)){
				return "Register SuccessFully... ";
			}
			else
			{
				return "Problem in Register";
			}
		}
		else
		{
			return "Validation Fail ";
		}
	}
	
	public String doLogin(UserDTO userDTO){
		if(isValid(userDTO)){
			UserDAO userDAO = UserDAO.getObject();
			//UserDAO userDAO = new UserDAO();
			if(userDAO.isAuth(userDTO)){
				return "Welcome "+userDTO.getUserid();
			}
			else
			{
				return "Invalid Userid Or password";
			}
		}
		else
		{
			return "Validation Fail...";
		}
	}
	private boolean isValid(UserDTO userDTO){
		//Math m = new Math();
		//System s = new System();
		//CommonValidation cv =new CommonValidation();
		if(isBlank(userDTO.getUserid()) &&
				isBlank(userDTO.getPassword())){
				//&& isBlank(userDTO.getPhone())){
			return false;
		}
		else
		{
			if(!isCorrectLength(userDTO.getPassword())){
				return false;
			}
			return true;
		}
	}
	
}
