package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercico05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno:");
		double nota1 = sc.nextDouble();
		double nota1f = nota1 * 0.4;
		
		System.out.println("Digite a segunda nota do aluno:");
		double nota2 = sc.nextDouble();
		double nota2f = nota2 * 0.6;
		
		
		double mediaPonderada = nota1f + nota2f;
		
		System.out.println("A media ponderada do aluno e " + mediaPonderada + ".");

	}

}
