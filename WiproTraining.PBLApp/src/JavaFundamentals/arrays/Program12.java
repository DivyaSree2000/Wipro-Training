package JavaFundamentals.arrays;

/* Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.
 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4] */
import java.util.Scanner;
public class Program12 {
	public static void main(String args[]) {
	int n;
    Scanner s = new Scanner(System.in);
    n = s.nextInt();
    int arr[] = new int[n];
    int arr1[]=new int[n];
    for(int i = 0; i < n; i++)
    {
        arr[i] = s.nextInt();
        
    }
    for(int i = 0; i < n; i++)
    {
    arr1[i]=s.nextInt();
    }
    int mid1, mid2;
	mid1 = (arr.length/2);
	mid2 = (arr1.length/2);
	int[] result = new int[2];
	result[0] = arr[mid1];
	result[1] = arr1[mid2];
	for (int i = 0; i < result.length; i++)
		System.out.print(result[i] + " ");
}
}