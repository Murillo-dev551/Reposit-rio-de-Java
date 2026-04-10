package mais_velho;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		int nome_zero = 0;
		int posicao_zero = idade[0];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			sc.nextLine();
			
			if (idade[i] > posicao_zero) {
				posicao_zero = idade[i];
				nome_zero = i;
			}
		}
		
		
		System.out.println("PESSOA MAIS VELHA: " + nome[nome_zero]);
		
		sc.close();
	}

}
