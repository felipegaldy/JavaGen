package br.com.generation.classesobjetos;

public class Cliente {
	
	private String nome;
	private int idade;
	private String email;
	private String endereco;
	
	public void comprar() {
		System.out.println("Tem desconto a vista? ");		
	}
	
	//metodo construtor
	public Cliente(String nome, int idade, String email, String endereco ) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
		
	}
	
	public void imprimirInfo() {
		System.out.println("\nO cliente "+nome+" que tem "+idade+" anos e o email "+email+" e mora na "+endereco);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
