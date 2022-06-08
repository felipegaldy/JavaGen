package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class ExercicioDoWhile01 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um
			número igual a zero. No final, mostre a soma dos números
			digitados.(DO...WHILE)
		 */
		int numero, soma=0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Informe um número :");
			numero = in.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("A soma dos números digitados: " + soma);
		
	}

}
