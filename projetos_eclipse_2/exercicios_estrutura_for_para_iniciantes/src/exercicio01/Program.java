package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		for (int i = 0; i<x; i++) {
			if (i%2 == 1) {
				System.out.println(i);
			}
		}
		
		
		sc.close();
	}
}
