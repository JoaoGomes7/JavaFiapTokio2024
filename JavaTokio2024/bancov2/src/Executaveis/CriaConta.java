package Executaveis;

import br.com.fiap.bancov2.Cliente;
import br.com.fiap.bancov2.Conta;

public class CriaConta {

	public static void main(String[] args) {


		Cliente clienteJoao= new Cliente ("joao", "Rua abc, 1000", "12345678", "02/03/2007");
		
		Conta contaJoao = new Conta(1L,clienteJoao);
		
		contaJoao.exibirSaldo();
		
		
		
		
	}

}
