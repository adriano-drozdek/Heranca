package aplicacao;

import entities.Conta;
import entities.ContaEmpresa;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {

		Conta conta1 = new Conta(1001, "Maria", 1000.0);
		conta1.sacar(200.0);
		System.out.println(conta1.getSaldo());
		
		Conta conta2 = new ContaPoupanca(1002, "João", 1000.0, 0.01);
		conta2.sacar(200.0);
		System.out.println(conta2.getSaldo());
		
		Conta conta3 = new ContaEmpresa(1003, "Paulo", 1000.0, 500.0);
		conta3.sacar(200.0);
		System.out.println(conta3.getSaldo());
	}

}
