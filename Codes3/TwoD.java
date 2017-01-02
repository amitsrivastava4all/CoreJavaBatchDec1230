
public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oned[]={20,40,45,90,46};
		//int k[][] = new int[3][];
		//int k[][] = new int[3][4];
		//int [][]k = new int[3][4];
		//int []k[] = new int[3][4];
		int k[][]= {{10,20,30},{40,50,60},{74,80,90,100}};
		//k[0] = new int[10];
		//k[1] = new int[20];
		//k[2]  = new int[30];
//		for(int i = 0 ; i<k.length;i++){
//			for(int j = 0; j<k[i].length;j++){
//				System.out.print(k[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		// Enhance For Loop
		for(int i[]:k){
			for(int j:i){
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
