package lab5;


	import java.util.Scanner;

	class Blank_Exception extends Exception {
		public Blank_Exception(String msg) {
			super(msg);
		}
	}

	public class Exe2 {
		String f_name;
		String l_name;

		Exe2(String fname, String lname) {
			this.f_name = fname;
			this.l_name = lname;
		}

		public static void main(String[] args) throws Blank_Exception {
			
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the First name");
				String f_name = sc.nextLine();
				System.out.println("Enter the Last name");
				String l_name = sc.nextLine();
				sc.close();
				Exe2 e2 = new Exe2(f_name, l_name);
				if (f_name.isEmpty() || l_name.isEmpty()) {
					throw new Blank_Exception("you left blank");
				}
			} catch (Blank_Exception e) {
				e.printStackTrace();

			}

		}


	}
