package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		double num1 = sc.nextInt();
		
		System.out.println("Digite outro numero:");
		double num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.println("Sao multiplos");
		}
		
		else {
			System.out.println("Nao sao multiplos");
		}

		
	}

}
