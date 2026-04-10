package media_pares;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?");
		int n = sc.nextInt();
		int soma = 0;
		int pares = 0;
		double media = 0;
		int[] par = new int [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			par[i] = sc.nextInt();
			
			if (par[i] % 2 == 0) {
				pares += 1;
				soma += par[i];
				media = soma/pares;
			}
		}
		
		
		if (media == 0) {
			System.out.println("\nNENHUM NUMERO PAR");
		}
		else {
			System.out.printf("\nMÉDIA DOS PARES = " + media);
		}
		
		sc.close();
	}

}
