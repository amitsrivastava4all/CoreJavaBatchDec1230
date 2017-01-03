
public class BreakAndContinueLabeledLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myloop: //define a label
		for(int i = 1 ; i<=3; i++){
			
			for(int j = 1; j<=3; j++){
				if(i==j){
					//continue myloop;
					break myloop;
				}
				else
				{
					System.out.println("I is "+i+" and j is "+j);
				}
			}
		}
		System.out.println("Now Outside the Loop");
		System.gc();

	}

}
