package lab3;
import java.util.*;
public class Exe3 {
	
	
		static String alterString(String str1)
		{
			StringBuffer sb=new StringBuffer(str1);
			String str2="";
			for(int i=0;i<str1.length();i++)
			{
				int a=sb.charAt(i);
				if(sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'||sb.charAt(i)=='A'||sb.charAt(i)=='E'||sb.charAt(i)=='I'||sb.charAt(i)=='O'||sb.charAt(i)=='U') {
					a=a;
				}
				else {
					a=a+1;
				}
				
				str2=str2+(char)a;
			}
			System.out.println(str2);
			return str1;
			
		}
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			String str = scan.nextLine();
			alterString(str);
			
			scan.close();
		}
}


	
		

	


