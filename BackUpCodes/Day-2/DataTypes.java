// IEEE-754 (Floating Point Calc)Standard
import java.util.Scanner;
strictfp class DataTypes
{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the Age");
int age = scanner.nextInt();
System.out.println("Enter the Name ");
scanner.nextLine();
String name = scanner.nextLine();

scanner.close();
System.out.println("Name is "+name+"\n Age is "+age);
//System.out.println(" Age is "+age);
// this is called Value Data Type
// this is also called Primitive Data Types
// Non - Decimal Value
int x=10; //4 byte
short y = 20; //2 byte
long z = 30; //8 byte
byte d = (byte)1130;  //1 byte
System.out.println(d);

// Decimal Value
float p = 100.24f;
double p2 = 100.233334555;


// Formula
//0,1 - bit
// bit base is 2
// 1 byte - 8 bit , 1 bit is for + -
// 7 bit is for number
// -2 ^ 7 to 2 ^ 7 -1
// -128 to 127


}
}