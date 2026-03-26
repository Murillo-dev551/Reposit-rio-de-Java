package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto produto;
		
		System.out.print("Deseja colocar a quantidade? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println();
			System.out.println("Digite o preço: ");
			int preco = sc.nextInt();
			System.out.println("Digite a quantidade:");
			int quantidade = sc.nextInt();
			
			Produto produto2 = new Produto(nome, preco, quantidade);
			System.out.println("Valor total " + produto2.valorTotal() );
			
		}
		else {
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o preço: ");
			int preco = sc.nextInt();
			
			Produto produto3 = new Produto(nome, preco);
			System.out.println("Não possível calcular o preço real, fique com os dados: " + produto3.exibir());
			
		}
		
		
		
		sc.close();
	}

}
