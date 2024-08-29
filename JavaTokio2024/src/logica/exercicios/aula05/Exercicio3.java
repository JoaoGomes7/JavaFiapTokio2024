package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = sc.nextLine();
		
		System.out.println("Escolha o seu genero:\n [M] \n [F] \n [O] \n [N]");
		
		char genero = sc.nextLine().charAt(0);
		
		System.out.println("Ola " + nome + ", seu genero e " + genero +"." );
		
		

		
		
		

	}

}
