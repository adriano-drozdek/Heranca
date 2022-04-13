package aplicacao;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {

		Conta conta1 = new Conta(1001, "Maria", 1000.0);
		conta1.sacar(200.0);
		System.out.println(conta1.getSaldo());
	}

}
