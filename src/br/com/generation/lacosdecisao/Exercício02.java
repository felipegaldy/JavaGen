package br.com.generation.lacosdecisao;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Exerc�cio02 {
	public static void main(String[] args) {
		/*
		 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		Locale.setDefault(new Locale("en", "US"));
        int numeroUm, numeroDois, numeroTres;

        numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
        numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo n�mero: "));
        numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Digite o Terceiro n�mero: "));

        if (numeroUm > numeroDois && numeroUm > numeroTres && numeroDois > numeroTres) 
        {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroTres + " " + numeroDois + " " + numeroUm);
        }
        else if (numeroUm > numeroDois && numeroUm > numeroTres && numeroTres > numeroDois) {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroDois + " " + numeroTres + " " + numeroUm);
        }
        else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroTres > numeroUm) {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroUm + " " + numeroTres + " " + numeroDois);
        }
        else if (numeroDois > numeroUm && numeroDois > numeroTres && numeroUm > numeroTres) {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroTres + " " + numeroUm + " " + numeroDois);
        }
        else if (numeroTres > numeroUm && numeroTres > numeroDois && numeroUm > numeroDois) {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroDois + " " + numeroUm + " " +  numeroTres);
        }
        else {
            JOptionPane.showMessageDialog(null, "A segu�ncia �: " + numeroUm + " " + numeroDois + " " + numeroTres);
		}
		
	}

}
