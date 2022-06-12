package br.com.generation.classesobjetos;
	/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto avião, defina as instancias deste
	objeto e apresente as informações deste objeto no console.
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
			System.out.println("O avião está decolando...");
		}
		public void pousar() {
			System.out.println("O avião está pousando...");
		}

	}
