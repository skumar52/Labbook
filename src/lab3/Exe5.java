package lab3;
  import java.util.*;

public class Exe5 {
	


		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter your text: ");
			String str=scan.nextLine();
			System.out.println("Characters in text are: "+str.length());
			String[] arr1=str.split("/n");
			System.out.println("Lines in texts are: "+arr1.length);
			String[] arr2=str.split(" ",0);
			System.out.println("Words in texts are: "+arr2.length);
			scan.close();
		}
	}

	
	

	


