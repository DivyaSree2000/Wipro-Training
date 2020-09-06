package OOPandInheritance.ClassesAndObjects;
/* Create a new class called Calculator with the following methods: 
 * 1. A static method called powerInt(int num1,int num2)
 * This method should return num1 to the power num2.
 * 2. A static method called powerDouble(double num1,int num2).
 * This method should return num1 to the power num2.
 * 3. Invoke both the methods and test the functionalities.
 * Hint: Use Math.pow(double,double) to calculate the power.
*/
import java.lang.Math;
import java.util.Scanner;
class Calculator{
	public static int powerInt(int num1, int num2){
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1, int num2){
		return Math.pow(num1,num2);
	}
}
public class Program2 {
  public static void main(String args[]) {	
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int powInt = Calculator.powerInt(num1, num2);
	double powDouble = Calculator.powerDouble((double)num1,num2);
	System.out.println("Power in integer format : " + powInt);
	System.out.println("Power in double format : " + powDouble);
	}
}
