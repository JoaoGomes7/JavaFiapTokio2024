package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a distancia total percorrida?");
		int distancia = sc.nextInt();
		
		System.out.println("Quantos litros de combustivel foram gastos?");
		int combustivel = sc.nextInt();
		
		int KmLitro = distancia / combustivel;
		
		System.out.println("Foram gastos " + KmLitro +"Km/L");
		
		if (KmLitro < 8) {
			System.out.println("Esse carro bebe em");
		}
		else {
			System.out.println("Autonomia legal");
		}
		
		
		
		
		
	}

}
