package br.com.generation.classesobjetos;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		ProdutoEletronico celular1 = new ProdutoEletronico();
		
		celular1.setNome("Celular");
		celular1.setModelo("Iphone 13");
		celular1.setPreco(7000);
		
		System.out.println(celular1.getNome());
		
		System.out.println(celular1.ligar());
		System.out.println("Esse é um "+ celular1.getModelo());
		System.out.println(celular1.desligar());
	}

}
