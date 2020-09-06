package JavaFundamentals.arrays;

import java.util.Scanner;

/* Write a program to remove the duplicate elements in an array and print the same.
 * Example)
 * I/P:{12,34,12,45,67,89}  O/P:{12,34,45,67,89}
*/
public class Program7 {
	public static void sort(int[] arr,int size){
		for(int i=1;i<size;++i){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int no=sc.nextInt();
			int i;
			int n[]=new int[no];
			//System.out.println("Enter all the elements:");
	        for(i = 0; i < no; i++)
	        {
	            n[i] = sc.nextInt();
	        }
	        sort(n,no);
			System.out.print(n[0]+" ");
			for(int itr=1;itr<no;itr++){
				if(n[itr-1]!=n[itr])
				System.out.print(n[itr]+" ");
			}
		}
		}

