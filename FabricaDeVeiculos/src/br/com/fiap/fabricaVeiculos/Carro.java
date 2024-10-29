package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {
	
	
//ATRIBUTOS//	
public String marca;
public String modelo;
public String cor;
public Date anoFabricacao = new Date();
public Date anoModelo = new Date();
public int renavam;
public boolean motor;
public String tipoCambio;
public double aroRodas;
public int velocidade;
public String nomeCondutor;
public boolean ligado = false;
int limiteVelocidade;

//METODOS//

public void ligarCarro() {
	if (this.ligado) {
		this.ligado = true;
	};
}


public void desligarCarro() {
	if (this.velocidade == 0) {
		this.ligado = false;
	};
}


public void acelerar(double valor) {
	if (this.ligado) {
		this.velocidade += valor;
		if (this.velocidade >= this.limiteVelocidade) {
			this.velocidade = this.limiteVelocidade;
		}
	 
	}
}



public void frear(double valor) {
	if (this.velocidade > 0) {
		this.velocidade -= valor;
	}
}



public void exibirDadosCarro() {
	
}
	                                                
	
		
		
		
		
	}

       
