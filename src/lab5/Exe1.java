package lab5;
import java.util.Scanner;

public class Exe1 {
	
	public Exe1(int age) {
		
	}

	//created exception class
	class myexception extends Exception {
		public myexception(String msg) {
			super(msg);
		}
	

	
		int age;

		void Exe1(int age) {
			this.age = age;
		}

		public static void main(String[] args) throws myexception {
			try {
				Scanner sc = new Scanner(System.in);
				int age = sc.nextInt();
				sc.close();
				if (age < 15) {
					throw new myexception("You age is below 15 years ");
				}
				Exe1 e1 = new Exe1(age);
			} catch (myexception e1) {
				System.out.println(e1);

			}
			System.out.println("End of code");

		}
	}
}
