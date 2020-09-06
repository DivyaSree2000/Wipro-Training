package OOPandInheritance.StringAndStringBuffer;
/* Write a Java program that accepts a string (with * in it). The program should return a new string in which the following characters are removed-*,the characters that are to the left and right of *
 * Example1)
 * i/p:ab*cd
 * o/p:ad */
import java.util.Scanner;
public class Program8 {
	public static void main(String[] args) {
	Scanner  in = new Scanner(System.in);
	System.out.println("Enter a String:");
	String str = in.next();
	String res = "";
	for (int i = 0; i < str.length(); i++)
		if (str.charAt(i) == '*')
			res = str.substring(0, i - 1) + str.substring(i+2, str.length());
	System.out.println(res);
}
}
