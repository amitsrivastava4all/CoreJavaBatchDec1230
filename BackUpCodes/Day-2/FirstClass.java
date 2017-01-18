class SecondClass{
// Package = Folder
	// main is execution point of a program
	// public (OutSide the Package)- main has a public access so java command can access ur main
	// static - It has only one copy in the memory, it is load when class is loaded
	// void  - not return type
	// String - It is a predefine class in Java, and String is basically a character array
	// String is a collection of characters 
	// args it is just a variable name and it can be anything
	// args is always an array type
	// String args[] - this is command line argument
	//... arr - This is called Var - Args (Java 1.5)
	// synchronized, final
	synchronized static public void main(String ...arr){
	
		final int X = 10;
		//x++;
		System.out.println("Hello Java "+X);
		return ;
		/*
		System - is a predefine class
		out is predefine object of PrintStream Class
		println is a predefine method of PrintStream class
		println - printline - always print in a new line
		print - it print in a same line
		System - in , out , err
		*/
	}
}