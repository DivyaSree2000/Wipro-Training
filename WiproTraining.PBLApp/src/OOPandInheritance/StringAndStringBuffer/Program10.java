package OOPandInheritance.StringAndStringBuffer;
/* Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string. 
 * You may assume that n is between 0 and the length of the string, inclusive. 
 * Example1)
 * i/p:Wipro,3
 * o/p:propropro */
import java.util.Scanner;
public class Program10 {
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			System.out.print("Enter the string : ");
			String str = in.next();
			System.out.print("Enter an integer : ");
			int n = in.nextInt();
			String substring = str.substring(str.length()-n, str.length());
			String res = "";
			for (int i = 0; i < n; i++)
				res = res + substring;
			System.out.println(res);
		}
}
