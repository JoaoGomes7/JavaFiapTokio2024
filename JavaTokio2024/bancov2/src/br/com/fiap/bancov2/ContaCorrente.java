package br.com.fiap.bancov2;

public class ContaCorrente extends Conta {
	
	
	private double saldoInvestimento;

	public ContaCorrente(long numeroConta, Cliente cliente) {
		super(numeroConta, cliente);

	}

	public double getSaldoInvestimento() {
		return saldoInvestimento;
	}

	public void setSaldoInvestimento(double saldoInvestimento) {
		this.saldoInvestimento = saldoInvestimento;
	}
	
	

	
	
	
	
}
