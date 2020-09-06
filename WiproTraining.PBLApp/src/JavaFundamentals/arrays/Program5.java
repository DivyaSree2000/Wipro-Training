package JavaFundamentals.arrays;

import java.util.Scanner;
/*
Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
*/
public class Program5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter no. of elements you want in array:");
        int n = sc.nextInt();
        int i,j,temp;
        int a[] = new int[n];
        //System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)
        	{
        		if(a[i]>a[j])
        		{
        			temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        }
        System.out.println("Largest 2 numbers are: "+a[n-1]+","+a[n-2]);
        System.out.println("smallest 2 numbers are: "+a[0]+","+a[1]);
	}

}
