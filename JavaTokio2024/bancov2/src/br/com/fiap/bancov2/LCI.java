package br.com.fiap.bancov2;

public class LCI implements Produto {
	
	@Override
	public double investir(double valor) {
		return valor * (1+ 0.0009);
	}
}
