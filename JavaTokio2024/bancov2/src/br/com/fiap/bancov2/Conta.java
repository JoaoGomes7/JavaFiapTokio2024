package br.com.fiap.bancov2;

public abstract class Conta  {
	
	
	
//---------------------------// ATRIBUTOS //-------------------------------------------------------------------

	protected long numeroConta;
	protected double saldo;
	protected Cliente cliente;
	
	
//---------------------------//CONSTRUTOR//------------------------------------------

	public Conta(long numeroConta, Cliente cliente) {
		
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	
	}
	
//---------------------------// METODOS //----------------------------------------------------------------------

	// SACAR//---------------------------------------------------------------------
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo = saldo - valor;
			System.out.println("Saque realizado");
			return true;
		}
		System.out.println("Saldo insuficiente");
		return false;
	}
	// -------------------------------------------------------------------------------

	// DEPOSITAR//--------------------------------------------------------------------

	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Deposito realizado com sucesso");
	}
	// --------------------------------------------------------------------------------

	// TRANSFERIR//--------------------------------------------------------------------
	public void transferir(Conta conta, double valor) {
		if (this.sacar(valor)) {
			conta.depositar(valor);
		}

	}
	//-----------------------------------------------------------------------------
	
	// EXIBIR SALDO//------------------------------------------------------------------
	public abstract void exibirSaldo();

}

