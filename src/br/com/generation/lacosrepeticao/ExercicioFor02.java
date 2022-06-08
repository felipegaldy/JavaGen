package br.com.generation.lacosrepeticao;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, par=0, impar=0;
		Scanner in = new Scanner(System.in);
		for(int i=0; i < 10 ; i++) {
			System.out.println("Digite um número: ");
			numero = in.nextInt();
			if(numero%2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		System.out.println("A quantidade de números par digitado é: " + par);
		System.out.println("A quantidade de números impar digitado é: " + impar);
	}

}
