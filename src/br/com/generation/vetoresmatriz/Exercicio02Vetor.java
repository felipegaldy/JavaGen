package br.com.generation.vetoresmatriz;

import java.util.Random;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
			que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
			imprima a média aritmética dos lançamentos, contabilize e apresente também
			quantas foram as ocorrências da maior pontuação.
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
		System.out.println("A maior pontuação foi "+maior+ ", ele apareceu "+ quantidade + " vezes.");


	}

}
