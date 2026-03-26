package application;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa pesso1 = new Pessoa("Murillo", 18);
		Pessoa pesso2 = new Pessoa("Clara", 19);
		
		
		System.out.println(pesso1.mostrarPessoa());
		System.out.println(pesso2.mostrarPessoa());
	}

}
