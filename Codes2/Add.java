class Add
{
public static void main(String args[]){
    //int p = 100;
    //String pp = new String[10];
    String name = "amit";
    System.out.println(name +" " +name.length());
    name = "amit srivastava";
    System.out.println(name +" "+name.length());
if(args.length==2){    
int firstNo = Integer.parseInt(args[0]);
int secondNo = Integer.parseInt(args[1]);
int result = firstNo + secondNo;
System.out.println("Sum is "+result);    
}
else{
System.out.println("Invalid Args , Need 2 Args");
}    
}
}