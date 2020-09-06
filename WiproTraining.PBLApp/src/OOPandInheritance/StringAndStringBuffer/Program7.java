package OOPandInheritance.StringAndStringBuffer;
/* Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged. 
 * If the input is "xHix", then output is "Hi".
 * If the input is "America", then the output is "America".*/
import java.util.*;
public class Program7 {
	private static String trimX(String str){
		if((str.charAt(0) == 'x' && str.charAt(str.length()-1) == 'x')||(str.charAt(0) == 'X' && str.charAt(str.length()-1) == 'X'))
			return str.substring(1,str.length()-1);
		if((str.charAt(0) == 'x')||(str.charAt(0) == 'X'))
			return str.substring(1);
		if((str.charAt(str.length()-1) == 'x')||(str.charAt(str.length()-1) == 'X'))
			return str.substring(0,str.length()-1);
		return str;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		System.out.println(trimX(sc.next()));
	}
}
