package JavaFundamentals.arrays;
/* Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
 * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
 * withoutTen([10, 2, 10]) → [2, 0, 0]
 * withoutTen([1, 99, 10]) → [1, 99, 0] */
import java.util.Scanner;
public class Program9 {
	public static int[] withoutTen(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++){
		if(nums[i] != 10){
		int temp = nums[i];
		nums[i] = 0;
		nums[result] = temp;
		result++;
		}else{
		nums[i] = 0;
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
	    withoutTen(arr);
	    for(int i =0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
	}
}