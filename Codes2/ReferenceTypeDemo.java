class ReferenceTypeDemo{
public static void main(String args[]){
int x = 10;
int y = x;
    if(x==y){
        
    }
y++;
x--;
System.out.println("x is "+x+" and y is "+y); 
String name = "ram";
//String name2 = name;
String name2 = "ram";
    String name3 = new String("ram");    
    if(name == name3){
        System.out.println("Same Ref");
    }
    else{
        System.out.println("not same ref");
    }
    if(name.equals(name3)){
        System.out.println("Same Value");
    }
    else{
        System.out.println("Not Same Value");
    }
}
}