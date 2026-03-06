package calculadora;

import java.util.Locale;
import java.util.Scanner;

import entities.calculos;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int escolha = 1;
		
		while (escolha != 0) {
			
			System.out.println("===== CALCULADORA =====");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair ");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("5 - Sair");
			
			System.out.println("Escolha uma opção: ");
			escolha = sc.nextInt();
			
			if (escolha == 5) {
				System.out.println("Saindo...");
				sc.close();
				break;
			}
			
			calculos n1;
			n1 = new calculos();
			
			System.out.println("Digite o primeiro número: ");
			n1.a = sc.nextDouble();
			System.out.println("Digite o segundo número: ");
			n1.b = sc.nextDouble();

			if (escolha == 1) {
				System.out.println("Resultado: " + n1.soma());
			}
			else if (escolha == 2) {
				System.out.println("Resultado: " + n1.sub());
			}
			else if (escolha == 3) {
				System.out.println("Resultado: " + n1.mult());
			}
			else if (escolha == 4 && n1.b == 0) {
				System.out.println("Erro: não é possível dividir por zero");
			}
			else if (escolha == 4 && n1.b != 0){
				System.out.println("Resultado: " + n1.div());
			}
		}
	}
}
