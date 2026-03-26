package entities;

public class Produto {
	public String nome;
	public int preco;
	public int quantidade;
	
	public Produto(String nome, int preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Produto(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
	}
	
	public int valorTotal() {
		return preco*quantidade;
	}
	
	public String exibir() {
		return nome + " " + preco;
	}
	
}
