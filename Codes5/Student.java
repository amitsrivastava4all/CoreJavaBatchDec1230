// OOPS
// OOAD - S O L I D
// S - SRP 
// D  - DRY 
// Class - Contains Characters
// Class Name Noun -
/*
 * I am a Comment
 */
/**
 *  This is a Student class and this class contains student information
 * @author amit
 * @since Jan 2017
 * @version 0.0.1
 * 
 */
// Class = Instance Variables  + Instance Methods
// Encapsulation - Binding of Instance Variables and Instance Methods
// into a single unit and this unit is called Class.
// Good Encapsualtion = private Instance Variables and public instance methods
// Data Hiding
public class Student {
	/**
	 * this field contains the student id 
	 */
	private int id; // this is a member variable of a class
	private String name;
	private String course;
	private double fees;
	private boolean att;
	private final String collegeName;
	private String awards;
	
	
	
	
public int getId() {
		return id;
	}
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public boolean isAtt() {
		return att;
	}
	public void setAtt(boolean att) {
		this.att = att;
	}
	public String getCollegeName() {
		return collegeName;
	}
//	public void setCollegeName(String collegeName) {
//		this.collegeName = collegeName;
//	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	//	{
//		System.out.println("Id "+id);
//		System.out.println("I am a Init Block and I am Pre Constructor Call");
//	}
//	{
//		System.out.println("Second Call");
//	}
//	{
//		System.out.println("Third Call");
//	}
	/*
	 * Constructor - It call when Object is created
	 * Construcrtor name is same as class name
	 * Constructor not return any thing it is kind of void
	 * It is used to initialize the instance variables
	 */
	// This is a Default Constructor
	// it by default there in every class
	private String giveCollegeNameFromDB(){
		return "SRCC";
	}
	Student(){
		//System.out.println("I am a Default Cons");
		collegeName = giveCollegeNameFromDB();
	}
	Student(int id , String name , String course ){
		// Instance Variable = Local Variable
		this();
		this.id = id + collegeName.length();
		this.name = name;
		this.course = course;
		
		
	}
	Student(int id , String name , String course,double fees, boolean att){
		this(id,name,course);
		this.fees = fees;
		this.att = att;
	}
	//Address address =new Address();
//	public void takeInput(int i , String n , double f, boolean a){
//		//instance variable = local variable
//		if(i>0 && f>0){
//		id = i; // Local Variable value set to instance variable
//		
//		name = n;
//		fees = f;
//		att = a;
//		}
//		else
//		{
//			System.out.println("Id or Fees Can't Be Negative...");
//		}
//	}
	public void print(){
		// this is a keyword and it hold the current reference
		System.out.println("Id "+this.id);  // (Ref)66.id
		System.out.println("Name "+name);
		System.out.println("Course "+course);
		System.out.println("Fees "+fees);
		System.out.println("Att "+att);
		System.out.println("College "+collegeName);
	}
	
}
