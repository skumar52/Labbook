package lab2;

import java.util.Arrays;
import java.util.Scanner;


public class Exe3 {
		
	
		static void getSorted(int arr[])
		{
			
		}
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			int n;
			n=scan.nextInt();
			int[] arr= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
			}
			getSorted(arr);
		}
	}

