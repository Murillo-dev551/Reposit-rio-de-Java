package numeros_pares;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int conta = 0;
		
		for (int i=0;i<n;i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
			if (vetor[i]%2 == 0) {
				conta ++;
			}
		}
		
		System.out.println("NÚMEROS PARES: ");
		for (int i=0; i<n; i++) {
			if (vetor[i]%2 == 0) {
				System.out.printf("%d ",vetor[i]);
			}
		}
		
		System.out.println("\nQUANTIDADE DE PARES = " + conta);
		
		
		
		sc.close();
	}

}
