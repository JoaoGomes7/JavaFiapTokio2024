package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escolha um numero de um a 999?");
	    int num = Integer.parseInt(sc.nextLine());
		
		
	    int centena = num / 100;
	    int centena2 = centena * 100;
	    
	    int dezena = num % centena2;
	    int dezena2 = dezena / 10;
	    int dezena3 = dezena2 * 10;
	    
	    int unidade = dezena % dezena3;
	    
	    System.out.println("Centena: " + centena2 + "\nDezena: " + dezena3 + "\nUnidade: " + unidade);

	}

}
