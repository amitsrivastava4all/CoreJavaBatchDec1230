
public class PalindomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = "nitin";
		StringBuffer sb = new StringBuffer("nitin");
		StringBuffer sb2 = new StringBuffer("nitin");
		sb2.reverse();
		//System.out.println(sb+" "+sb2);
		//if(sb.length()==sb2.length()){
		//if(name.equals(sb2.toString())){
		if(sb.toString().equals(sb2.toString())){
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		//}

	}

}
