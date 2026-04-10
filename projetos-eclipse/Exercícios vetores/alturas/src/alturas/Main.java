package alturas;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		double soma = 0.0;
		double media = 0.0;
		double menor16 = 0.0;
		double porcentagem = 0.0;
		int[] idade = new int[n];
		double[] altura = new double[n];
		String[] nome = new String[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i + 1);
			
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] =  sc.nextInt();
			if (idade[i] < 16) {
				menor16++;
			}
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine();
			
			soma += altura[i];
			media = soma/n;
			porcentagem = (menor16*100.00)/n;
		}
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", porcentagem);
		
		for (int i=0; i<n; i++) {
			if (idade[i] < 16.0) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();

	}

}
