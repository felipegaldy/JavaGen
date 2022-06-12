package br.com.generation.classesobjetos;
/*
 * Crie uma classe funcion�rio e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto funcion�rio, defina as
	instancias deste objeto e apresente as informa��es deste objeto no
	console.
 */

public class Funcionario {
	
	private String nome;
	private double salario;
	private int id;
	
	public double receberAumento(){
		double aumento = (this.salario * 0.15) + this.salario;
		return aumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
