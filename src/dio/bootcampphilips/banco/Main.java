package dio.bootcampphilips.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Banco itau = new Banco();
		Banco santander = new Banco();
		itau.setNome("Itau");
		santander.setNome("Santander");
		
		Cliente felipe = new Cliente();
		felipe.setNome("Felipe");
		Cliente serena = new Cliente();
		serena.setNome("Serena");
		
		
		Conta cc = new ContaCorrente(felipe, itau);
		Conta poupanca = new ContaPoupanca(felipe, itau);
		Conta cc2 = new ContaCorrente(serena, santander);
		Conta poupanca2 = new ContaPoupanca(serena, santander);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);
        Banco banco = new Banco();
        banco.setContas(contas);
        System.out.println(banco.getContas());
        System.out.println(banco.getContasByNumero(2));
        System.out.println(banco.getContasBySaldo(0.0));

		
	}
}
