package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		
		Cachorro auau1 = new Cachorro();
		
		auau1.setNome("Scooby");
		auau1.setIdade(5);
		auau1.setSom("Auuuuuu au au au Auuuuuuuu");
		auau1.setVelocidade(25);
		
		System.out.println("Som do cachorro..." + auau1.getNome());
		auau1.som(auau1.getSom());
		
		
		Cavalo pocoto1 = new Cavalo();	
		
		pocoto1.setNome("Bala no Alvo");
		pocoto1.setIdade(8);
		pocoto1.setSom("iiirrrrí, rilinchin");
		pocoto1.setVelocidade(65);
		
		System.out.println("Som do cavalo...");
		pocoto1.som(pocoto1.getSom());
		
		Preguica preguica1 = new Preguica();
		
		preguica1.setNome("Eaaaeeee");
		preguica1.setIdade(25);
		preguica1.setSom("zzzZZZzzZz...");
		preguica1.setSubirArvore(true);
		
		System.out.println("Som da preguiça...");
		preguica1.som(preguica1.getSom());

	}

}
