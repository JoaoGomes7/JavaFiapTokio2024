package Homework;

import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tentativas = 0;

	//do { 
		
		System.out.println("digite o usuario: ");
		String nome = sc.nextLine();
	
		System.out.println("digite sua senha: ");
		int senha = sc.nextInt();
	
		if (nome.equalsIgnoreCase("administrador") && senha == 123) {
			System.out.println("Logado");
			
		tentativas ++;
		}
		
	//} while ();
		
	

			
		

	}
}