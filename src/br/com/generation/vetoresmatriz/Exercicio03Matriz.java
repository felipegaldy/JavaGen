package br.com.generation.vetoresmatriz;

import java.util.Random;

public class Exercicio03Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
				das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
				posição das matrizes N1 e N2.
		 */
		int[][]	N1 = new int[4][6], N2 = new int[4][6], M1 = new int[4][6], M2 = new int[4][6];
		Random random = new Random();
		for(int i = 0; i < N1.length; i++) {
			for(int j=0; j < N1[i].length; j++) {
				N1[i][j] = random.nextInt(100);
				N2[i][j] = random.nextInt(100);
			}
		}
		for(int i = 0; i < M1.length; i++) {
			for(int j=0; j < M1[i].length; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		
		System.out.println("Matriz N1");
		for(int i = 0; i < N1.length; i++) {
			for(int j=0; j < N1[i].length; j++) {
				System.out.printf(N1[i][j] + " | ");				
			}
			System.out.println();
		}
		System.out.println("Matriz N2");
		for(int i = 0; i < N2.length; i++) {
			for(int j=0; j < N2[i].length; j++) {
				System.out.printf(N2[i][j] + " | ");				
			}
			System.out.println();
		}
		
		System.out.println("Matriz M1");
		for(int i = 0; i < M1.length; i++) {
			for(int j=0; j < M1[i].length; j++) {
				System.out.printf(M1[i][j] + " | ");				
			}
			System.out.println();
		}
		System.out.println("Matriz M2");
		for(int i = 0; i < M2.length; i++) {
			for(int j=0; j < M2[i].length; j++) {
				System.out.printf(M2[i][j] + " | ");				
			}
			System.out.println();
		}
		
	}

}
