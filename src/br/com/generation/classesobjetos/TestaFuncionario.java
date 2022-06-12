package br.com.generation.classesobjetos;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		
		funcionario1.setNome("Felipe");
		funcionario1.setSalario(5000);
		funcionario1.setId(2358);
		
		System.out.println("Parabéns "+ funcionario1.getNome()+" você recebeu um aumento pelos seu bom desempenho!");
		System.out.println("Seu novo salário é de " + funcionario1.receberAumento());

	}

}
