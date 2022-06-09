package br.com.generation.lacosrepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)
		 */
		Locale.setDefault(new Locale("en", "US"));
		
		double media;
		int numero, soma=0, quantidadeNumeros=0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = in.nextInt();
			
			if(numero%3 == 0) {
			quantidadeNumeros++;
			soma += numero;
			}
			
		}while(numero != 0);
		media = soma / quantidadeNumeros;
		System.out.println("A média dos números múltiplos de 3 é: " + media);
		

	}

}
