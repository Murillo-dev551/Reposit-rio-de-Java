package entities;

public class Carro {
	public String marca;
	public int modelo;
	public int ano;
	
	public void mostrarDados() {
		System.out.println(marca);
		System.out.println(modelo);
		System.out.println(ano);
	}
	
	public int idadeCarro(int ano_atual) {
		return ano_atual - ano;
	}
}
