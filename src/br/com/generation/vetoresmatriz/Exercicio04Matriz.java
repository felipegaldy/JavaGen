package br.com.generation.vetoresmatriz;

import java.util.Random;

public class Exercicio04Matriz {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
			em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
			diagonal, ou seja, diagonal principal.
		 */
		int[][] matriz = new int[3][3];
		int soma=0, somaDiagonal=0;
		Random random = new Random();
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				matriz[i][j] = random.nextInt(100);
				soma += matriz[i][j];
				if(i == j) {
					somaDiagonal += matriz[i][j];
				}
			}
		}
		System.out.println("=======MATRIZ PREENCHIDA=======");
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.printf(matriz[i][j]+" | ");
				Thread.sleep(500);
			}
			System.out.println();
		}
		System.out.println("A soma de todos os valores: "+ soma);
		Thread.sleep(500);
		System.out.println("A soma dos valores na dagonal: "+ somaDiagonal);
	}

}
