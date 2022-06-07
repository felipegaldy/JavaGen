package br.com.generation.lacosdecisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
			categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto
		 */
		Locale.setDefault(new Locale("en", "US"));
		int idade;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade: "));
		if(idade >= 10 && idade <= 14) {
			JOptionPane.showMessageDialog(null, "Categoria Infantil");
		}else if(idade >= 15 && idade <= 17) {
			JOptionPane.showMessageDialog(null, "Categoria Juvenil");
		}else if(idade >=18 && idade <=25){
			JOptionPane.showMessageDialog(null, "Categoria Adulto");			
		}else {
			JOptionPane.showMessageDialog(null, "Sem Categoria");
		}
		
	}
}
