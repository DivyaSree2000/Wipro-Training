package JavaFundamentals.flowControlStructures;
/* Write a program to check if a given number is prime or not. */
import java.util.Scanner;

public class Program12{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			int num = scan.nextInt();
			boolean isPrime = true;
			for(int i=2;i<num;i++){
				if(num%i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
	}