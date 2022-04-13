package entities;

public class ContaEmpresa extends Conta {

	private Double limiteEmprestimo;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor -10.0;
		}
	}
}
