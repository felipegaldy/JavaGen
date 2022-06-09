package br.com.generation.vetoresmatriz;

import java.util.Random;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
			que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
			imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
			quantas foram as ocorr�ncias da maior pontua��o.
		 */
		int[] vetor = new int[10];
		int soma=0, maior=0, quantidade=0;
		double media;
		Random random = new Random();
		//registra o valor no vetor
		for(int i=0; i < vetor.length; i++) {
			vetor[i] = random.nextInt(1,7);
			soma += vetor[i];
			if(vetor[i] > maior) {
				maior = vetor[i];
				quantidade=0;
			}
			if(vetor[i] == maior) {
				quantidade++;
			}
		}
		//mostra os valore do vetor
		for(int i=0; i < vetor.length; i++) {
			System.out.printf(vetor[i]+ " | ");
		}
		media = soma / vetor.length;
		System.out.println("\nA media foi: "+media);
		System.out.println("A maior pontua��o foi "+maior+ ", ele apareceu "+ quantidade + " vezes.");


	}

}
