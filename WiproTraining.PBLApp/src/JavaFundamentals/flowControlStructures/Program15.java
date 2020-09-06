package JavaFundamentals.flowControlStructures;
/*
Write a program to print * in Floyds format (using for and while loop)
*
*  *
*  *   *
Example1)
C:\>java Sample 
O/P: Please enter an integer number
Example2)
C:\>java Sample 3
O/P :
*
*  * 
*  *  *
*/
import java.util.Scanner;
public class Program15{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
			int num = scan.nextInt();
			for(int i=0;i<num;i++){
				int j=0;
				while(j<=i){
					System.out.print("* ");
					j++;
				}
				System.out.println();
			}
	}
}