class Student extends Object
{
	Course course ;
	Student (Course course){
		this.course = course;
		System.out.println("Student Cons Call"); 
		
	}
	protected void finalize(){
		System.out.println("Student Gone..");
	}
}
class Course
{
	Course(){
		System.out.println("Course Cons Call");
	}
	protected void finalize(){
		System.out.println("Course Gone..");
	}
}
public class AggDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course course = new Course();
		Student ram = new Student(course);
		ram = null;
		System.gc();
		for(int i = 1; i<=5; i++){
			System.out.println("Doing some thing else..."+i);
		}
	}

}
