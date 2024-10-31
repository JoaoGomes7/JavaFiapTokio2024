package br.com.fiap.bancov2;

public class CDB implements Produto {

	

	@Override
	public double investir(double valor) {
		return valor * ( 1 + 0.001);
	}
	
	
	
}
