package entities;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public ContaBancaria(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	
	
}
