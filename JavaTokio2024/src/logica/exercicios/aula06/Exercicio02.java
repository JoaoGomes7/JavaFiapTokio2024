package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		
		double num1 = sc.nextDouble();
		
		System.out.println("Digite outro numero");
		
		double num2 = sc.nextDouble();
		
		if (num1 > num2) {
			System.out.println(num1 + " e maior que " + num2 + ".");
		}
		
		else if (num2 > num1) {
			System.out.println(num2 +" e maior que " + num1 + ".");
		}
		
		else {
			System.out.println("Os numeros sao iguais");
		}
		
		

	}

}
