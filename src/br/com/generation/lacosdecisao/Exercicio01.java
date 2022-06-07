package br.com.generation.lacosdecisao;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio01 {
	
	public static void main(String[] args) {
		/*
		 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		Locale.setDefault(new Locale("en", "US"));
		int numero1, numero2, numero3, maior=0;
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
		if(numero1 > maior) {
			maior = numero1;
		}
		if(numero2 > maior) {
			maior = numero2;
		}
		if (numero3 > maior) {
			maior = numero3;
		}
		JOptionPane.showMessageDialog(null,"O maior número digitado foi: " + maior);
		
		
	}

}
