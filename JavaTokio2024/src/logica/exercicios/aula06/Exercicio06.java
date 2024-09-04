package logica.exercicios.aula06;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu ano de nascimento.");
		int idade = (2024 - sc.nextInt());
		
		if (idade >= 18) {
			System.out.println("Seu voto e obrigatorio.");
		}
		
		else if ((idade >= 16 && idade < 18) || (idade > 70)) {
			System.out.println("Seu voto e opcional.");
		}
		
		else {
			System.out.println("Seu voto e proibido.");
		}


		
		
	}

}
