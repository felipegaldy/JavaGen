package br.com.generation.classesobjetos;

public class Banco {
	
	private String nome;
	private double saldo;
	private String tipoConta;
	
	
	public double depositar(double valor) {
		this.saldo += valor;
		return saldo;
	}
	
	public double sacar(double valor) {
		this.saldo -= valor;
		return saldo;
	}
	
	public void verSaldo() {
		System.out.println("O seu saldo atual é: R$"+this.saldo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	

}
