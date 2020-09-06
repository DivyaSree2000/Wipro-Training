package JavaFundamentals.flowControlStructures;
/*
Initialize a character variable in a program and 
print 'Alphabet' if the initialized value is an alphabet, 
print 'Digit' if the initialized value is a number, and 
print 'Special Character', if the initialized value is anything else.
*/
import java.util.*;
public class Program5{
	public static void main(String[] args){
			Scanner scan=new Scanner(System.in);
			char ch = scan.next().charAt(0);
			if((ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122))
				System.out.println("Alphabet");
			else if(ch >= 48 && ch <= 57)
				System.out.println("Digit");
			else
				System.out.println("Special Character");
	}
}