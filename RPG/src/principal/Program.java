package principal;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Status;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Bem-vindo ao Java Quest!");
		System.out.println("Digite o nome do seu Herói: ");
		String nome = sc.next();
		String inimigo = "Dragão de código";
		
		Status x;
		x = new Status();
		
		int heroi = x.a;
		int dragao = x.b;
		
		System.out.println("---------------------------------");
		System.out.println("Herói: " + nome + " [HP: 100]");
		System.out.println("Inimigo: " + inimigo + " [HP: 80]");
		System.out.println("---------------------------------");
		
		System.out.println("1 - Atacar");
		System.out.println("2 - Curar");
		System.out.println("3 - Fugir");
		System.out.println("4 - Sair");
		System.out.println("Escolha uma opção: ");
		
		int escolha = sc.nextInt();
		
		while (escolha != 4) {
			
			if (escolha == 1) {
				int dano = rand.nextInt(40);
				dragao = dragao - dano;
				System.out.printf("%s atacou o Dragão e causou %d de dano!!!%n", nome, dano);
				if (dragao > 0 ) {
					int danodragao = rand.nextInt(30);
					heroi = heroi - danodragao;
					System.out.printf("O %s contra-ataca e causa %d de dano em você!!%n", inimigo, danodragao);
				}else {
					System.out.printf("O %s caiu antes de conseguir contra-atacar!%n", inimigo);
				}
				
				System.out.printf("Herói: %s [HP: %d]%n", nome, heroi);
				System.out.printf("INIMIGO: %s [HP: %d]%n", inimigo, dragao);
			}
			else if (escolha == 2) {
				int cura = rand.nextInt(20);
				heroi = heroi + cura;
				System.out.printf("Você recuperou +%d de sua vida.%n", cura);
				System.out.println("Status: ");
				System.out.printf("Herói: %s [HP: %d]%n", nome, heroi);
				System.out.printf("INIMIGO: %s [HP: %d]%n", inimigo, dragao);
			}
			else if (escolha == 3) {
				System.out.println("Não tem outros inimigos, final secreto.");
				break;
			}
			
			if (heroi <= 0) {
				System.out.println("Você perdeu... Inicie o jogo novamente.");
				break;
			}
			else if (dragao <= 0) {
				System.out.println("Você venceu!!! Recomece o jogo se quiser jogar novamente.");
				break;
			}
			System.out.println("Escolha outra opção: ");
			System.out.println("1 - Atacar");
			System.out.println("2 - Curar");
			System.out.println("3 - Fugir");
			System.out.println("4 - Sair");
			escolha = sc.nextInt();
		}
		
		System.out.println("Muito obrigado por jogar.");
		System.out.println("E obrigado também para quem me deu a ideia.");
		
		sc.close();
	}
}
