package br.com.fiap.banco;

public class Executavel {

	public static void main(String[] args) {

		Conta contaEmerson = new Conta();
		Conta contaDri = new Conta();

		contaEmerson.depositar(10000);
		contaDri.depositar(10000);

		contaDri.sacar(2000);
		contaEmerson.sacar(200);

		contaEmerson.exibirSaldo();
		contaDri.exibirSaldo();

		contaEmerson.transferir(contaDri, 4999);

		contaEmerson.sacar(1);

		contaDri.transferir(contaEmerson, 99);

		contaEmerson.exibirSaldo();
		contaDri.exibirSaldo();

	}

}
