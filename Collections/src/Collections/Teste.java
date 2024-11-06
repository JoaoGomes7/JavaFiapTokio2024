package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(new Usuario(1, "joao", "12345"));
		lista.add(new Usuario(2, "Ferreirinha", "12345"));
		lista.add(new Usuario(3, "calleri", "12345"));
		lista.add(new Usuario(4, "luciano", "12345"));
		lista.add(new Usuario(5, "lucas", "12345"));
		
		for(Usuario usuario: lista) {
			System.out.println(usuario.getNome());
		}
		
		Collections.sort(lista);
		
		System.out.println("Lista ordenada");
		for (Usuario usuario: lista) {
			System.out.println(usuario.getNome());
		}
		
		System.out.println("Removendo usuario");
		remover("Paulo")
		
	}

}
