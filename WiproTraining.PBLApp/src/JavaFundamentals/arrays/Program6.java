package JavaFundamentals.arrays;

import java.util.Scanner;
/* Write a program to initialize an array and print them in a sorted order. */
public class Program6 {
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
	    for(int i=1;i<n;i++) {
	    	int m=arr[i];
	    	for(int j=i;j>0;j--) {
	    		if(arr[j]<arr[j-1]) {
	    			arr[j]=arr[j-1];
	    			arr[j-1]=m;
	    		}
	    		else
	    			break;
	    	}
	    }
	    for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
	}

}