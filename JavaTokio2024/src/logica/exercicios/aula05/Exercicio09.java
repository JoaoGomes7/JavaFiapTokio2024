package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escolha um numero de um a 999?");
	    int num = Integer.parseInt(sc.nextLine());
		
		int centena = num / 100;
		int centena2 = centena * 100;
		
		int dezena = num / 100;
		int dezena2 = dezena * 10;
		
		int unidade = num / 100;
		int unidade2 = unidade * 1;
		
		System.out.println("\n" + centena2 + "\n" + dezena2 + "\n"+unidade2);
		 

	}

}
