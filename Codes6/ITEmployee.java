/**
 * 
 * @author amit
 *
 */
public class ITEmployee {
	private int id;
	private String name;
	private double salary;
	private String deptName;
	private String managerName;
	private final int PF ;
	ITEmployee(){
		PF = 1500;
		deptName = "DEV";
	}
	ITEmployee(int id, String name, double salary){
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	/**
	 * 
	 * @return
	 */
	private double hra(){
		return salary * 0.30;
	}
	private double da(){
		return salary * 0.20;
	}
	private double ta(){
		return salary * 0.10;
	}
	private double computeNS(){
		return salary + hra() + da() + ta() - PF;
	}
	private String grade(){
		double netSalary = computeNS();
		if(netSalary>=50000){
			return "A Grade";
		}
		else
		if(netSalary<50000 && netSalary>=40000){	
			return "B Grade";
		}
		else
		if(netSalary<40000 && netSalary>=30000){	
			return "C Grade";
		}
		else{
			return "D Grade";
		}
	}
	
	public String printSalarySlip(String delimeter){
		String output = "*****************************\n";
		output+="Id "+id+delimeter;
		output+="Name "+name+delimeter;
		output+="Salary "+salary+delimeter;
		output+="Dept "+deptName+delimeter;
		output+="Manager Name "+managerName+delimeter;
		output+="HRA "+hra()+delimeter;
		output+="DA "+da()+delimeter;
		output+="TA "+ta()+delimeter;
		output+="NS "+computeNS()+delimeter;
		output+="Grade "+grade()+delimeter;
		output+="****************************"+delimeter;
		return output;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
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
	

}
