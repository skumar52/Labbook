package lab3;
import java.io.*;
import java.util.Scanner;
public class Exe2 {
	
		static String getImage(String str1) {
			StringBuffer sb=new StringBuffer(str1);
			sb.reverse();
			System.out.println(str1+"|"+sb);
			return str1+"|"+sb;
		}
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			String str = scan.nextLine();
			getImage(str);
			
			scan.close();
		}
		
	}
	

	
		

	

	
		
	
	  

