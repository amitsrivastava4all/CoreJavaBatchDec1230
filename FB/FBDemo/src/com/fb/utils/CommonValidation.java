package com.fb.utils;

public class CommonValidation {
	private CommonValidation(){}
	private static final int DEFAULT_LENGTH = 8;
	public static boolean isBlank(String value){
		if(value!=null && value.trim().length()>0){
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static boolean isCorrectLength(String value , int ...fieldLength){
		int length = DEFAULT_LENGTH;
		if(fieldLength!=null && fieldLength.length>0){
			length = fieldLength[0];
		}
		if(value!=null && value.length()>=length){
			return true;
		}
		else
		{
			return false;
		}
	}

}
