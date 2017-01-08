
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("नमस्ते Java");
		int a = 0 ;
		int b = 0 ;
		int c = a +b;
		System.out.println("Sum is "+c);
		int p[]={10,24,12,34,54};
		int sum = 0;
		for(int i : p){
		//for(int i = 0; i<p.length; i++){
			//int num = p[i];
			int num = i;
			while(num>0){
				int mod = num % 10;
				if(mod==4){
					sum = sum + i;
					break;
				}
				num = num/10;
			}
		}
		System.out.println(sum);
		
	}

}
