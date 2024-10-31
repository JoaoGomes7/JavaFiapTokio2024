package br.com.fiap.bancov2;

import java.util.Scanner;

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

	// INVESTIR// ------------------------------------------------------------------------------

	public void investimento(Produto produto, int valor) {
		this.saldoInvestimento += produto.investir(valor);
	}

	public void exibirSaldo() {
		System.out.println("Nome: " + this.cliente.getNomeCliente());
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data nasc: " + this.cliente.getDataNasc());

	}

}
