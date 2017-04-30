class Logic{
	static void myLogic(){
		System.out.println("I want Lock on this Line1.."+Thread.currentThread().getName());
		System.out.println("I want Lock on this Line2.."+Thread.currentThread().getName());
		System.out.println("I want Lock on this Line3.."+Thread.currentThread().getName());
	}
}


// Step - 1 create Job a) Runnable Interface b) Thread Class
class Job  //extends Thread {
implements Runnable {
	int t ;
	Logic logic =new Logic();
	public  void run(){
		for(int i = 1; i<=5; i++,t++){
			System.out.println("T is "+t+" I is "+i+" Name is "+Thread.currentThread().getName());
		}
//		synchronized(logic){
//			logic.myLogic();
//		}
		synchronized (Logic.class) {
			Logic.myLogic();
		}
	}
}
public class Demo1 {

	public static void main(String[] args) {
		Class cls = Logic.class;  // Meta Infor of a Class
//		Thread myThread = new Thread(new Runnable(){
//			public void run(){
//				System.out.println("My Job ....");
//			}
//		},"mythread");
//		myThread.start();
//		
//		Thread myThread2 = new Thread(()->System.out.println("My Job2...."),"mythread3");
//		myThread2.start();
		// TODO Auto-generated method stub
		Job job = new Job();
		//job.start();
		Thread worker = new Thread(job,"ram");
		worker.setPriority(Thread.MAX_PRIORITY);
		
		
		//Job job2 = new Job();
		Thread worker2 = new Thread(job,"shyam");
		worker2.setPriority(Thread.NORM_PRIORITY);
		//worker.setDaemon(true);
		worker.start();
		worker2.start();
		
		
		
//		StringBuilder sb = new StringBuilder();
//		synchronized(sb){
//			sb.append("Hello");
//		}
//		sb.deleteCharAt(0);
	}

}
