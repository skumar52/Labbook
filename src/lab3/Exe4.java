package lab3;
import java.util.Scanner;
public class Exe4 {
	
		static int modifyNumber(int number1)
		{
			String str=Integer.toString(number1);
			StringBuffer sb=new StringBuffer(str);
		
			StringBuffer sb1 =new StringBuffer();
			for(int i=0;i<str.length();i++) 
			{
				int a,b,c;
				if(i==str.length()-1) 
				{
					a=sb.charAt(i);
					b=sb.charAt(0);
					c=Math.abs(b-a);
				}
				else 
				{
				a=sb.charAt(i);
				b=sb.charAt(i+1);
				c=Math.abs(b-a);
				}

				sb1=sb1.append(c);
			}
			int d=Integer.parseInt(sb1.toString());
			System.out.println(d);
			return 0;
			
		}
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			modifyNumber(n);
			scan.close();
		}
	}



	


