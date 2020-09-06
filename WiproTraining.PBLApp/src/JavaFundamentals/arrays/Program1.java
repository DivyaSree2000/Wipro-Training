package JavaFundamentals.arrays;
/* Write a program to initialize an integer array and print the sum and average of the array. */
import java.util.Scanner;
public class Program1{
	public static void main(String[] args){
		//int[] arr = {76,21,32,78,12,43,21,65,91,39,7}
		int sum = 0;
		Scanner s = new Scanner(System.in);
	    System.out.print("Enter no. of elements you want in array:");
	   int n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Enter all the elements:");
	    for(int i = 0; i < n; i++)
	    {
	        arr[i] = s.nextInt();
		 sum = 0;
		//System.out.print("Array: ");
		for(int i1 =0;i1<arr.length;i1++){
			//System.out.print(arr[i1] + " ");
			sum+=arr[i1];
		}
	}
	    float avg=(float)sum/arr.length;
	    System.out.println("\nSum: " + sum + "\nAverage: " + avg);
}
}