package abaixo_da_media;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double media = 0.0;
		double soma = 0.0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			soma += vect[i];
			media = soma/n;
		}
		
		System.out.printf("%nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
		for (int i=0; i<n; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
