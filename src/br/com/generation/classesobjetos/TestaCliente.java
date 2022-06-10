package br.com.generation.classesobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		//estanciando objeto
		Cliente pessoa = new Cliente("Felipe", 28, "cliente@gmail.com", "R. Amelia 37");
		pessoa.comprar();
		pessoa.imprimirInfo();

	}

}
