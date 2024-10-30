package br.com.fiap.bancov2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {

//ATRIBUTOS//
	private String endereçoCliente;
	private String nomeCliente;
	private String cpfCliente;
	private Date dataNasc = new Date();

//CONSTRUTOR//
	public Cliente(String endereçoCliente, String nomeCliente, String cpfCliente, String dataNasc) {
		this.endereçoCliente = endereçoCliente;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			this.dataNasc = format.parse(dataNasc);
		} catch (ParseException e) {
			System.out.println("Formato de data invalido: " + dataNasc);
			e.printStackTrace();
		}

	}

	// GATTERS AND SETTERS
	public String getEndereçoCliente() {
		return endereçoCliente;
	}

	public void setEndereçoCliente(String endereçoCliente) {
		this.endereçoCliente = endereçoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

}
