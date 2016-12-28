class MainChanges{

public static void main(double x){
System.out.println("Inside double main...");
}    
    
public static void main(int x){
System.out.println("Inside int main...");
}    
    // ... is called var args JDK 1.5
    // String ...arr or String []arr - It is called Command Line Arguments
    // e.g md <directoryname>
    // e.g copy <sourcefilename> <targetfilename>
static public  void main(String ...arr){
System.out.println("Hello Java");
    main(10);
    main(10.20);
}
}