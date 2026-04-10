package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double soma = 0.0;
		double media = 0;
		double[] vetor = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
			media = soma/n;
		}
		
		System.out.print("Valores: ");
		
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		System.out.printf("MEDIA = %.2f", media);
		
		sc.close();

	}

}
