
public class B implements Banco {
	
	private Double transferencia;
	private Conta conta;
	private Double saqueD;
	private Double depositoD;
	private Double verba;
	
	public B(Conta conta) {
		super();	
		this.conta = conta;	
	}
	@Override
	public Double getConta() {
		Double impostoFAZOL = conta.getSaldo() - 1;
		return conta.setSaldo(impostoFAZOL);
	}
	@Override
	public Double getSaque(Double saqueD) {
		Double gastar = conta.getSaldo() - saqueD;
				return conta.setSaldo(gastar);
	}
	@Override
	public Double getDeposito(Double depositoD) {
		Double maaaaais = conta.getSaldo() + depositoD;
		return conta.setSaldo(maaaaais);
	}
	public int getUserBanco() {
		
		return conta.getNumeroConta();
	}
	@Override
	public Double getSaldo() {
		
		return conta.getSaldo();
	}
	public void transferencia(Conta contaT, Double transferencia) {
		if(transferencia <= 500.00) {
			Double transferir = transferencia + contaT.getSaldo();
			Double retirar = conta.getSaldo() - transferencia;
			transferencia = transferencia + contaT.getSaldo();
			conta.setSaldo(retirar);
			contaT.setSaldo(transferir);
		}else {
			System.out.println("Alem de municipio voce tambem tem limite, presta atenção irmão!");
		}
	}

}
