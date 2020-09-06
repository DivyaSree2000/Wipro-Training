package JavaFundamentals.flowControlStructures;
/*
Write a Java program to find if the given number is palindrome or not
Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome
Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome
*/
import java.util.*;
public class Program17{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			int num = scan.nextInt();
			int rev = 0;
			while(num>0){
				rev = rev*10+num%10;
				num/=10;
			}
			if(num == rev)
				System.out.println("a palindrome");
			else
				System.out.println("not a palindrome");
	}
}