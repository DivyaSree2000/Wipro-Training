package JavaFundamentals.flowControlStructures;
/* Write a program to print the sum of all the digits of a given number.
 * Example1) 
 * I/P:1234 O/P:10 */
import java.util.Scanner;

public class Program14{
	public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			int num = scan.nextInt();
			int sum = 0;
			for(;num>0;num/=10)
				sum+=(num%10);
			System.out.println(sum);
	}
}