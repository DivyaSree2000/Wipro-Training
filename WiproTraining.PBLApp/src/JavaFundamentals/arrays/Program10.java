package JavaFundamentals.arrays;
/* Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.
 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
 * evenOdd([3, 3, 2]) → [2, 3, 3]
 * evenOdd([2, 2, 2]) → [2, 2, 2]
*/
import java.util.Scanner;
public class Program10 {
	private static int[] evenOdd (int[] nums) {
		int temp = 0;
		int pos = 0;
		for (int i = 0; i < nums.length; i++) {
		if (nums[i] % 2 == 0) {
		temp = nums[pos];
		nums[pos] = nums[i];
		nums[i] = temp;
		pos++;
		}
		}
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        arr[i] = s.nextInt();
	    }
	    evenOdd(arr);
	    for(int i =0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}

}