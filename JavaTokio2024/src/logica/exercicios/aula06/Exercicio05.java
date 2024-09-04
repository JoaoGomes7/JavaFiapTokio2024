package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro numero:");
		int num2 = sc.nextInt();
		
		System.out.println("Escolha a operacao[+, -, *, /]:");
		char operacao = sc.next().charAt(0);
		
		switch (operacao) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			default:
				System.out.println("Operacao invalida");
				
				
		}
		 
		


	}

}
