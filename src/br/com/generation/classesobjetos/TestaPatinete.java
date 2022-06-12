package br.com.generation.classesobjetos;

public class TestaPatinete {

	public static void main(String[] args) throws InterruptedException {
		
		Patinete patinete1 = new Patinete();
		
		patinete1.setCor("Preto");
		patinete1.setAno(2022);
		patinete1.setModelo("Eletrônico");
		patinete1.setRodas(2);
		
		System.out.println("=====Patinete=====");
		System.out.println("Cor: "+patinete1.getCor());
		System.out.println("Ano: "+patinete1.getAno());
		System.out.println("Modelo: "+patinete1.getModelo());
		System.out.println("Rodas: "+patinete1.getRodas());
		
		patinete1.acelerar(70);
		

	}

}
