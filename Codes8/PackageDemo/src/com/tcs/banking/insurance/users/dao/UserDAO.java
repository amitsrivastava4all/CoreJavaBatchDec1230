package com.tcs.banking.insurance.users.dao;

import com.tcs.banking.insurance.users.dto.MessageDTO;
import com.tcs.banking.insurance.users.dto.UserDTO;

public class UserDAO {
	// Array of Objects
	//UserDTO userDTO[] = new UserDTO[5];
	UserDTO userDTOArray[];
	int index = 0;
//	private void fill(String uid, String pwd, String pinCode){
//		userDTO[index].setUserid(uid);
//		userDTO[index].setPassword(pwd);
//		userDTO[index].setPinCode(pinCode);
//		index++;
//	}
	private void prepareDB(){
		userDTOArray = new UserDTO[]{
				new UserDTO("amit","123","55555"),
				new UserDTO("ram","123","55555")
				, new UserDTO("shyam","123","44444")
				,new UserDTO("mike","123","99999"), 
				new UserDTO("tom","123","55555")
				
		};
//		userDTO[0] = new UserDTO();
//		fill("amit","123","33333");
//		userDTO[1] = new UserDTO();
//		fill("ram","123","33333");
//		userDTO[2] = new UserDTO();
//		fill("shyam","123","33333");
//		userDTO[3] = new UserDTO();
//		fill("mike","123","33333");
//		userDTO[4] = new UserDTO();
		//fill("tom","123","33333");
		
		
	}
	//String db[][]= new String[5][20];
	protected MessageDTO authenticateUser(UserDTO userDTO){
		prepareDB();
		String message = "Invalid Userid or password";
		String status = "FAIL";
		//for(int i = 0 ; i<userDTOArray.length; i++){
		// UserDTO userObject = userDTOArray[i];
		for(UserDTO userObject : userDTOArray){
			if(userObject.getUserid().equals(userDTO.getUserid())
					&& userDTO.getPassword().equals(userObject.getPassword()) 
					&& userDTO.getPinCode().equals(userObject.getPinCode())){
				message = "Welcome "+userDTO.getUserid();
				status = "SUCCESS";
				break;
			}
					
		}
//		if(userDTO.getUserid().equals("amit") 
//				&& userDTO.getPassword().equals("123") && 
//				userDTO.getPinCode().equals("55555")){
//			message = "Welcome "+userDTO.getUserid();
//		}
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setMessage(message);
		messageDTO.setStatus(status);
		return messageDTO;
		//userDTO.setMessage(message);
		//return userDTO;
		
	}

}
