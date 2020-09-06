package JavaFundamentals.arrays;
/* WAP to print the sum of the elements of an array following the given below condition.
 * If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.
 * Eg1) Array Elements - 10,3,6,1,2,7,9  O/P: 22  [i.e 10+3+9] 
 * Eg2) Array Elements - 7,1,2,3,6 O/P:19
 * Eg3) Array Elements - 1,6,4,7,9 O/P:10
*/

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    int li[] = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        li[i] = s.nextInt();
	    }
			int sum = 0; 
			boolean add = true; 

			for (int i = 0; i < n; i++) 
			{ 
				if (li[i] != 6 && add == true) 
					sum = sum + li[i]; 
				else if (li[i] == 6) 
					add = false; 
				else if( li[i] == 7) 
					add = true; 
			}  
			System.out.print(sum); 
		} 
	}
