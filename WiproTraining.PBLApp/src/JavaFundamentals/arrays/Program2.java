package JavaFundamentals.arrays;
/* Write a program to initialize an integer array and find the maximum and minimum value of the array. */

import java.util.*;
public class Program2 {
	public static void main(String[] args) 
    {
	int n;
    Scanner s = new Scanner(System.in);
    //System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int arr[] = new int[n];
    //System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
        arr[i] = s.nextInt();
    }
	int min=arr[0];
	int max=arr[0];
    for(int i=1;i<arr.length;i++){
		//System.out.print(arr[i] + " ");
		if(arr[i]<min)
			min = arr[i];
		if(arr[i]>max)
			max = arr[i];
	}
	System.out.println("\nMIN: " + min + "\nMAX: " + max);
   }
}