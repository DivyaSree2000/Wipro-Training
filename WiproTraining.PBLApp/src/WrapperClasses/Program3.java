package WrapperClasses;

import java.util.Scanner;
/*
Define a java class that accepts an integer(between 1 and 255) from the user and displays 
the String representation of the argument passed as an unsigned integer in base 2. 
The output displayed should contain 8 digits and should be padded with leading 0s(zeros), 
in case the returned String contains less than 8 characters.
For example, if the user enters the value 16, then the output should be
00010000
and if the user enters the value 100, the output should be
01100100
You are expected to use Integer class conversion method/s described in the PDF file. 
Use Scanner class to accept user inputs.(Hint : You may use String.format() method for the expected output)
*/
public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String output=Integer.toBinaryString(num);
		int l=output.length();
		if(l<8) {
			for(int i=l;i<8;++i)
				System.out.print("0");
		}
		System.out.println(output);
	}

}