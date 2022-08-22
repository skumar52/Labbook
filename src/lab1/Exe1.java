package lab1;

import java.util.*;

public class Exe1 {
	
	public static void main(String args[])
	{
		// for runtime input
		Scanner scan=new Scanner(System.in); 
		int num;
		num=scan.nextInt();
		int a,b,sum=0;
		while(num!=0)
		{
			a=num%10;
			num=num/10;
			
			b=(int) Math.pow(a, 3);
			sum=sum+b;
		}
		System.out.println(sum);
	}
}



