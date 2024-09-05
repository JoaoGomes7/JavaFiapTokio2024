package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de KW gastos:");
		double KwGastos = sc.nextDouble();
		
		
		System.out.println("Qual tipo de residencia?");
		double cliente = sc.nextDouble();
		
		if (cliente == 1) {
			System.out.println("O valor da sua conta sera " + KwGastos * 0.60 + "R$");
		}
		else if (cliente == 2) {
			System.out.println("O valor da sua conta sera " + KwGastos * 0.48 + "R$");
		}
		else {
			System.out.println("O valor da sua conta sera " + KwGastos * 1.29 + "R$");
		}
	

		
		
	}

}
