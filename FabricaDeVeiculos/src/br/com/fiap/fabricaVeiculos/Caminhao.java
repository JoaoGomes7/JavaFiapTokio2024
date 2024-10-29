package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao {

//ATRIBUTOS//
String marca;
String modelo;
String cor;
Date anoFabricacao = new Date();
Date anoModelo = new Date();
int renavam;
boolean motor;
String tipoCambio;
double aroRodas;
int velocidade;
int eixos;
int qtdCargaSuportada;
int qtdCargaAbastecida;
String nomeCondutor;
boolean ligado = false;
int limiteVelocidade;



//METODOS//



public void ligarCaminhao() {
	if (this.ligado) {
		this.ligado = true;
	};
}


public void desligarCaminhao() {
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


public void carregar(int valor) {
	if (this.velocidade == 0) {
		this.qtdCargaAbastecida += valor;
		if (this.qtdCargaAbastecida > this.qtdCargaSuportada ) {
			System.out.println("A quantidade maxima de carga suportada ja foi excedida.");
		}
		
	}
}


public void descarregar(int valor) {
	if (this.velocidade == 0) {
		this.qtdCargaAbastecida -= valor;
	}
}




// CADASTRAR OS ATRIBUTOS NA CLASSE EXECUTAVEL ( ExecCaminhao ) // 
// APOS O CADASTRO, TESTAR TODOS OS METODOS//
public void exibirDadosCaminhao() {
	
	System.out.println(marca);
	System.out.println(modelo);
	System.out.println(cor);
	System.out.println(anoFabricacao);
	System.out.println(anoModelo);
	System.out.println(renavam);
	System.out.println(motor);
	System.out.println(tipoCambio);
	System.out.println(aroRodas);
	System.out.println(eixos);
	System.out.println(nomeCondutor);
	
}





}


