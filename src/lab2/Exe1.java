package lab2;

import java.util.*;
public class Exe1 {
	static int getSecondSmallest(int arr[]) 
	{
		Arrays.sort(arr);
		System.out.println(arr[1]);
		return arr[1];
	}
	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter the size of an array");
		
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		if(n>1) {
		int[] arr=new int[n];
		System.out.println("Enter elements of an array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		getSecondSmallest(arr);
		}
		else
		{
			System.out.println("array size should be greater than 1");
		}
	}
}
		

	
