package logica.exercicios.aula05;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual valor (em reais) devera ser convertido?");
		double valorReal = Double.parseDouble(sc.nextLine());
		
	    double valorDolar = valorReal * 0.18;
	    		
	    double valorEuro = valorReal * 0.16;
	    
	    double valorPeso = valorReal * 168.81;
	    
	    double valorLibra = valorReal * 0.13;
	    
	    double valorLene = valorReal * 25.74;
	    
	    
		System.out.println("Os valores covertidos serao: \n Dolar: " +valorDolar+ " \n Euro: " +valorEuro+ " \n Peso Argentino: " + valorPeso + " \n Libra: " + valorLibra + " \n Lene : " + valorLene );

	}

}
