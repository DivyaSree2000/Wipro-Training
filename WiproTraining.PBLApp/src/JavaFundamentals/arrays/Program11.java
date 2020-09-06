package JavaFundamentals.arrays;
/* Given an array of type int, print true if every element is 1 or 4. 
 * only14([1, 4, 1, 4]) → true
 * only14([1, 4, 2, 4]) → false
 * only14([1, 1]) → true */
import java.util.Scanner;
public class Program11 {
	private static boolean only14(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1 || arr[i]==4)
				continue;
			else
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
	int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++)
    {
        arr[i] = s.nextInt();
    }
    System.out.println(only14(arr));
}
}