package br.com.generation.classesobjetos;

public class TestaPaciente {

	public static void main(String[] args) {
		
		Paciente pessoa1 = new Paciente("Felipe Silveira", 28, 181, 69);
		
		System.out.println("O paciente "+ pessoa1.getNome());
		pessoa1.tomarRemedio();
		pessoa1.repousar();
	}

}
