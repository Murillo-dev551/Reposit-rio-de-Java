import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		double maior_valor = vet[0];
		int posicao = 0;
		
		for (int i=0; i<n;i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
			
			if (vet[i] > maior_valor) {
				maior_valor = vet[i];
				posicao = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", maior_valor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
		
		sc.close();
	}

}
