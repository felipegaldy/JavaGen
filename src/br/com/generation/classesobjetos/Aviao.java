package br.com.generation.classesobjetos;
	/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
 	*/

	public class Aviao {
		
		private int id;
		private String modelo;
		private int ano;
		
		public Aviao (int id, String modelo,int ano) {
			this.id = id;
			this.modelo = modelo;
			this.ano = ano;
		}
		
		public void decolar() {
			System.out.println("O avi�o est� decolando...");
		}
		public void pousar() {
			System.out.println("O avi�o est� pousando...");
		}

	}
