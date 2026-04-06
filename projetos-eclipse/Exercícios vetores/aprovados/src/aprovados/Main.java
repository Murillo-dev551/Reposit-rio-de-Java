package aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		String[] nome = new String[n];
		double[] semestre1 = new double[n];
		double[] semestre2 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			semestre1[i] = sc.nextDouble();
			semestre2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (int i=0; i<n; i++) {
			if ((semestre1[i] + semestre2[i])/2 >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
