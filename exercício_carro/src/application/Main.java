package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Carro carro = new Carro ();
		
		System.out.print("Marca do carro: ");
		carro.marca = sc.nextLine();
		System.out.println();
		System.out.print("Modelo do carro: ");
		carro.modelo = sc.nextInt();
		System.out.println();
		System.out.print("Ano do carro: ");
		carro.ano = sc.nextInt();
		System.out.println();
		System.out.print("Em qual ano estamos? ");
		int ano_atual = sc.nextInt();
		System.out.println();
		
		
		carro.mostrarDados();
		
		System.out.println("Idade do carro " + carro.idadeCarro(ano_atual));
		
		
		
		sc.close();

	}

}
