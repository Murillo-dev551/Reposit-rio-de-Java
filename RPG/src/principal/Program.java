package principal;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entities.Inimigos;
import entities.Status;
import itens.Equipamentos;

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
		
		int heroi = x.vida;
		int dano_heroi = x.dano;

		Inimigos y = new Inimigos();
		
		int vida_dragao = y.vida;
		int dano_dragao = y.dano;
		
		System.out.println("---------------------------------");
		System.out.println("Herói: " + nome + " [HP: 20]");
		System.out.println("Inimigo: " + inimigo + " [HP: 20]");
		System.out.println("---------------------------------");
		
		System.out.println("Escolha um equipamento:");
		System.out.println("1 - Espada (20 de ataque)");
		System.out.println("2 - Escudo (10 de defesa)");
		
		int escolha1 = sc.nextInt();
		
		Equipamentos z = new Equipamentos();
		
		int espada = z.espada;
		int escudo = z.escudo;
		
		int equipamento_heroi = 0;
		
		if (escolha1 == 1) {
			equipamento_heroi = espada;
			System.out.println("Você escolheu espada !!");
		}
		else if (escolha1 == 2){
			equipamento_heroi = escudo;
			System.out.println("Você escolheu escudo !!");
		}
		
		System.out.println("1 - Atacar");
		System.out.println("2 - Curar");
		System.out.println("3 - Fugir");
		System.out.println("4 - Sair");
		System.out.println("Escolha uma opção: ");
		
		int escolha2 = sc.nextInt();
		
		while (escolha2 != 4) {
			if (escolha2 == 1 && escolha1 == 1) {
				int dano_heroi_turno = dano_heroi + espada;
				vida_dragao = vida_dragao - dano_heroi_turno;
				System.out.printf("%s atacou o Dragão e causou %d de dano!!!%n", nome, dano_heroi_turno );
				if (vida_dragao > 0) {
					int dano_dragao_turno = dano_dragao;
					heroi = heroi - dano_dragao;
					System.out.printf("%s contra-ataca e causa %d de dano!!!%n", inimigo, dano_dragao_turno);
				}else {
					System.out.printf("% caiu antes de contra-atacar!!%n", inimigo);
				}
				
				System.out.printf("Herói: %s [HP: %d]%n", nome, heroi);
				System.out.printf("INIMIGO: %s [HP: %d]%n", inimigo, vida_dragao);
			}
			else if (escolha2 == 1 && escolha1 == 2) {
				vida_dragao = vida_dragao - dano_heroi;
				System.out.printf("%s atacou o Dragão e causou %d de dano!!!%n", nome, dano_heroi);
				dano_dragao = dano_dragao - escudo;
				heroi = heroi - dano_dragao;
				System.out.printf("%s contra-ataca e causa %d de dano!!!%n", inimigo, dano_dragao);
				System.out.printf("Herói: %s [HP: %d]%n", nome, heroi);
				System.out.printf("INIMIGO: %s [HP: %d]%n", inimigo, vida_dragao);
			}
			else if (escolha2 == 2) {
				int cura = 2;
				heroi = heroi + cura;
				System.out.printf("Você curou %d de vida", cura);
			}
			else if(escolha2 == 3) {
				int chance_fuga = rand.nextInt(3) + 1;
				if (chance_fuga <= 4) {
					System.out.println("Parabéns você conseguiu fugir!!!");
					break;
				}
			}
			
			if (heroi <= 0) {
				System.out.println("Você perdeu!! Reinicie o jogo para recomeçar.");
			}
			else if (vida_dragao <= 0) {
				System.out.println("Você venceu!! Reinicie o jogo se quiser recomeçar.");
			}
			System.out.println("1 - Atacar");
			System.out.println("2 - Curar");
			System.out.println("3 - Fugir");
			System.out.println("4 - Sair");
			System.out.println("Escolha uma opção: ");
			
			escolha2 = sc.nextInt();
		}
		
		System.out.println("Muito obrigado por jogar.");
		System.out.println("E obrigado também para quem me deu a ideia.");
		sc.close();
	}
}
