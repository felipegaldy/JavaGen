package br.com.generation.classesobjetos;

public class Patinete {
	
	private String cor;
	private int rodas;
	private String modelo;
	private int ano;
	
	public void acelerar(int velocidade) throws InterruptedException {
		int acelerar = 0;
		System.out.println("Acelerando patinete...");
		for(int i = 0; acelerar <= velocidade; i++) {
			acelerar += i;
			System.out.printf(acelerar+"...");
			Thread.sleep(300);
		}
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	

}
