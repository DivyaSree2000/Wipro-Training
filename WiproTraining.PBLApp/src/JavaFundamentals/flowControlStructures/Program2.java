package JavaFundamentals.flowControlStructures;
/*
Write a program to check if a given integer number is odd or even.
*/
import java.util.*;
public class Program2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}