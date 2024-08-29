package logica.exercicios.aula05;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do produto a ser pago?");
		double valorProduto = Double.parseDouble(sc.nextLine());
		
		System.out.println("Quanto foi pago?");
		double valorPago = Double.parseDouble(sc.nextLine());
		
		double troco = valorPago - valorProduto;
		System.out.println("O valor do troco a ser recebido e: " + troco + ".");
		
		sc.close();

	}

}
