package entities;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;

	public Conta() {
		super();
	}

	public Conta(Integer numero, String titular, Double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

}
