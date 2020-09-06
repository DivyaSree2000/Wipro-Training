package Abstraction_Packages_ExceptyionHandling.exceptionHandling.Program3;
/* Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the user while executing the program.
 * In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)
*/
import java.util.Scanner;
public class Program3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		for (int i = 0; i < 2; i++) {
			String name = "";
			int no;
			System.out.print("\nEnter Name: ");
			name = sc.nextLine();
			System.out.print("\nEnter No of subjects: ");
			no=sc.nextInt();
			int[] sub = new int[no];
			try{
				for(int j=0;j<no;j++){
					if (sc.hasNextInt())
						sub[j] = sc.nextInt();
					else
						throw new NumberFormatException();
					if (sub[j] < 0) throw new NegativeValuesException();
					if (sub[j] > 100) throw new ValuesOutOfRangeException();
				}
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			} catch (NegativeValuesException e) {
				System.out.println(e.getMessage());
			} catch (ValuesOutOfRangeException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Name: " + name);
			for(int j=0;j<no;j++)
				System.out.println("Marks of subject " + (char)(65+j) + ": " + sub[j]);
		}
	}
}
