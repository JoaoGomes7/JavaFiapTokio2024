package Collections;

import java.util.List;

import java.util.Iterator;

public class Usuario implements Comparable<Usuario> {

	// ATRIBUTOS//

	int idUsuario;
	static String nome;
	String senha;

	// CONSTRUTOR//
	public Usuario(int idUsuario, String senha, String nome) {
		this.idUsuario = idUsuario;
		this.senha = senha;
		this.nome = nome;
	}

	// GATTERS E SETTERS//

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Usuario user) {
		if (this.getIdUsuario() < user.getIdUsuario()) {

			return -1;
		}
		if (this.getIdUsuario() > user.getIdUsuario()) {

			return 1;
		}

		return 0;

	}

/*
 * public List<Usuario> remover(String nome) { List<Usuario> list;
 * java.util.Iterator<Usuario> iterator = list.iterator(); while
 * (iterator.hasNext()) { Usuario usuario = iterator.next(); if
 * (Usuario.getNome() == nome) { iterator.remove(); } } return list;
 * 
 * ListaAtualizada = test.remover("lucas"); for (
 * 
 * Usuario user : ListaAtualizada) { System.out.println(user.getNome()); } } }
 */
