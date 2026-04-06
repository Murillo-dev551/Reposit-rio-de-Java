package dados_pessoais;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char[] genero = new char[n];
		double maior = 0.0;
		double menor = 0.0;
		double contar = 0.0;
		double media = 0.0;
		int contarf = 0;
		int contarh = 0;
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
			
			if (i == 0) {
				maior = altura[i];
				menor = altura[i];
			}
			if (altura[i] > maior) {
				maior = altura[i];
			}
			if (altura[i] < menor){
				menor = altura[i];
			}
			
			if (genero[i] == 'F') {
				contarf += 1;
				contar += altura[i];
				media = contar/contarf;
			}
			else {
				contarh += 1;
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Número de homens = " + contarh);
		
		sc.close();
	}

}
