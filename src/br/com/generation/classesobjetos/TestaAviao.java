package br.com.generation.classesobjetos;

public class TestaAviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao(1248, "Boeing", 2018);
		
		aviao1.decolar();
		aviao1.pousar();

	}

}
