/*
 * Rule - 1 Weaker Access Rule
 * private , default (not a keyword), protected, public
 * Rule-2 CoVariant Return Type 
 * 
 */
class X
{
	int y,z,a,b,c;
	
}
class XPlus extends X{
	int t,g,k;
}
class BaseClass {
	X show(){
		System.out.println("Base Class Show Call");
		return new X();
	}
}
class SubClass extends BaseClass{
	@Override
	public XPlus  show(){
		System.out.println("SubClass Show Call");
		return new XPlus();
	}
}

class A{
	int x;
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass obj = new SubClass();
		obj.show();
	}

}
