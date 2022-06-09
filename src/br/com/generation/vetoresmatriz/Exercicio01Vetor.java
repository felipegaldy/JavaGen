package br.com.generation.vetoresmatriz;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
			atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */
		
		double[] vetor = new double[5];
		double maior=0;
		 
		
		for(int i = 0; i < vetor.length; i++ ) {
			System.out.println("Informe um valor: ");
			vetor[i] = new Scanner(System.in).nextDouble();
			if(vetor[i] > maior) {
				maior = vetor[i];
			}
		}
		System.out.println("A maior pontuação foi: "+ maior);
		
	}

}
