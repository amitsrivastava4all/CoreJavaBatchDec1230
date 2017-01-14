/*
 * OOPS  & OOAD
 * What is Class?
 * Class is Category
 * Class is BluePrint
 * Class is Template
 */
// S O L I D
// S - SRP 
// D -DRY
// Encapsulation = Binding Data and Methods into a Single Unit
// Class is an example of Encapsulation
// Gud Encapsulation - private member Variables and public methods are make gud encapsulation
// What is Data Hiding - Hide your variables by making private or protected
// Data Abstraction (Data Hiding)
// Abstraction 
public class Employee {
private  int id;  // Member Variables (Instance variables) of a Class
private String name;
 private int age;
 private double salary;
 private String companyName;
 private String deptName;
 private String managerName;
 
 
 /*
  * Every Class by default has default constructor
  * It is Empty be default and it is doing nothing
  * Constructor is used to initalize the member variables
  * of a class
  * Constructor is call when u create a object
  */
 public Employee(){
	// this(1001,"Ram",21,9999);
	 companyName="TCS";
 }
 
 // constructor overloading
 // this is called param constructor
 public Employee(int id , String name, int age , double salary){
	 //Employee();
	 this();  // Constructor Call must be the first line
	 this.id = id + companyName.length();
	 this.name = name;
	 this.salary = salary;
	 this.age = age;
	 //this();
 }
 
// // Setter / Getter Methods
// public void setSalary(double salary){
//	 this.salary = salary;
//	 
// }
// 
// public double getSalary(){
//	 return salary;
// }
 
 
 
private boolean validate(int id , String name , int age, double salary){
	 boolean isValidate = false;
	 if(id>0 && name!=null && name.trim().length()>0 && age>0 && salary>0)
	 {
		 isValidate = true;
	 }
		 return isValidate;
			 
 }
 
 
 public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}





public int getId() {
	return id;
}

// takeInput() method has their own local variables
public void takeInput(int id , String name, int age , double salary){
	// id = i;
	 if(validate(id, name, age, salary)){
	 this.id = id;  // Instance Variable = Local Variable
	 this.name = name;
	 this.salary = salary;
	 this.age = age;
	 }
	 else
	 {
		 System.out.println("Invalid Data....");
	 }
	
 }
 // method always a verb
 public void print(){  // Instance Method
	 // this - It is a predefine keyword in Java
	 // it contain the same reference of calling point
	 // it hold the current reference
	 // Implict this
	 System.out.println(id);
		System.out.println(name);  // compiler will write this.name
		System.out.println(salary);
		System.out.println(companyName);
 }
}
