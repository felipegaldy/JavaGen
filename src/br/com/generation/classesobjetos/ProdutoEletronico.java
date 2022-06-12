package br.com.generation.classesobjetos;

/*
 * Crie uma classe produto eletrônico e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto produto eletrônico,
	defina as instancias deste objeto e apresente as informações deste objeto
	no console.
 */

public class ProdutoEletronico {
	private String nome;
	private String modelo;
	private int preco;
	
	public String ligar() {
		String ligando = "O " + this.nome + " está ligando.";
		return ligando;
	}
	public String desligar() {
		String desligando = "O " + this.nome + " está desligando.";
		return desligando;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
