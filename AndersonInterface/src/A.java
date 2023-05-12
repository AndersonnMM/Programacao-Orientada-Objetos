
public class A implements Banco {
		
	private Double transferencia;
	private Conta conta;
	private Double saqueD;
	private Double depositoD;
	private Double verba;
	

	public A(Conta conta) {
		super();
		this.conta = conta;	
	}

	@Override
	public Double getConta() {
		Double taxa = conta.getSaldo() - 1;
		return conta.setSaldo(taxa);
	}

	@Override
	public Double getSaque(Double saqueD) {
		Double retira = conta.getSaldo() - saqueD;
				return conta.setSaldo(retira);
	}

	@Override
	public Double getDeposito(Double depositoD) {
		Double maaaais = conta.getSaldo() + depositoD;
		return conta.setSaldo(maaaais);
	}

	public int getUserBanco() {
		
		return conta.getNumeroConta();
	}
	
	@Override
	public Double getSaldo() {
		
		return conta.getSaldo();
	}
	
	public void transferencia(Conta contaT, Double transferencia) {
		Double transferir = transferencia + contaT.getSaldo();
		Double retirar = conta.getSaldo() - transferencia;
		transferencia = transferencia + contaT.getSaldo();
		conta.setSaldo(retirar);
		contaT.setSaldo(transferir);
	}
}
