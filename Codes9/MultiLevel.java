class GrandPa
{
	int x =10;
}
class Pa extends GrandPa
{
	int x = 20;
}
class Child extends Pa{
	int x= 30;
	Child(int x){
		
		Pa g = this;
		GrandPa g2 = g;
		
		
		//GrandPa g = this;
		int z = this.x + x + ((Pa)this).x + ((GrandPa)this).x;
		System.out.println(z);
	}
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(40);

	}

}
