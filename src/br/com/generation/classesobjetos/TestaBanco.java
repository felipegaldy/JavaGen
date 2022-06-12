package br.com.generation.classesobjetos;

import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {
		
		Banco cliente1 = new Banco();
		
		cliente1.setNome("Felipe Silveira");
		cliente1.setSaldo(5000);
		cliente1.setTipoConta("Conta Corrente");
		
		System.out.println("=====Informações do cliente=====");
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Saldo: "+ cliente1.getSaldo());
		System.out.println("Tipo de conta: "+ cliente1.getTipoConta());
		
		System.out.println("Depositar valor: ");
		double deposito = new Scanner(System.in).nextInt();
		cliente1.depositar(deposito);
		System.out.println("=====Novo Saldo=====");
		System.out.println("Saldo: "+ cliente1.getSaldo());
		
		System.out.println("Sacar valor: ");
		double saque = new Scanner(System.in).nextInt();
		cliente1.sacar(1250);
		System.out.println("=====Novo Saldo=====");
		System.out.println("Saldo: "+ cliente1.getSaldo());
		cliente1.verSaldo();
		
		

	}

}
