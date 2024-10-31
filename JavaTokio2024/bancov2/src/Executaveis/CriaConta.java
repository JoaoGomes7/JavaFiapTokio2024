package Executaveis;

import br.com.fiap.bancov2.Cliente;
import br.com.fiap.bancov2.Conta;
import br.com.fiap.bancov2.ContaCorrente;

public class CriaConta {
	

	public static void main(String[] args) {                                             


		Cliente clienteJoao= new Cliente ("joao", "Rua abc, 1000", "12345678", "02/03/2007");
		
		ContaCorrente contaJoao = new ContaCorrente(12345678L,clienteJoao);
		

		
		
		
	}

}
