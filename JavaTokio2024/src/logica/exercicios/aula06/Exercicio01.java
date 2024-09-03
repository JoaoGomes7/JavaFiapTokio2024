package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");

		

		if (sc.nextInt() % 2 == 0) {
			System.out.println("Esse numero e par");
		}
		
		else {
			System.out.println("Esse numero e impar");
		}
		
		sc.close();

	}
}
