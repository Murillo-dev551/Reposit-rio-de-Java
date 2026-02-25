package exercício03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	void main() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt(); 
		
		for (int i=0; i<N; i++) {
			double num1, num2, num3;
			double mpesos, somap, div;
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			num3 = sc.nextDouble();
			
			mpesos = (num1*2)+(num2*3)+(num3*5);
			somap = 2 + 3 + 5;
			div = mpesos/somap;
			
			System.out.printf("%.1f", div);
			
		}
		
		
		sc.close();
	}
}
