package lab2;
import java.util.*;

public class Exe2 {
	int getSecondSmallest(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Exe1 ob = new Exe1();
		int secod = ob.getSecondSmallest(a);
		System.out.println(secod);

	}

}
