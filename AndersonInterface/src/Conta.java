
public class Conta {
	private int numeroConta;
	private Double saldo;
	
	public Conta() {

	}
	
	public Conta(int numeroConta, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double setSaldo(Double saldo) {
		return this.saldo = saldo;
	}

}
