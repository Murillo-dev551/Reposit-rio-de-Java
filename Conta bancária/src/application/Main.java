package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		ContaBancaria conta;
		
		System.out.print("Número: ");
		int numero = sc.nextInt();
		System.out.println();
		System.out.print("Nome: ");
		String nome = sc.next();
		System.out.println();
		System.out.print("Titular: ");
		String titular = sc.next();
		System.out.println();
		System.out.print("Depósito inicial? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'n') {
			conta = new ContaBancaria(numero, titular);
		}
		else {
			double valor = sc.nextDouble();
			conta = new ContaBancaria(numero, titular, valor);
		}
		
		
		
		
		
		  
		
		sc.close();
	}

}
