package logica.exercicios.aula06;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota do primeiro bimestre");
		int bim1 = sc.nextInt();
		
		System.out.println("Digite a nota do segundo bimestre");
		int bim2 = sc.nextInt();
		
		System.out.println("Digite a nota do terceiro bimestre");
		int bim3 = sc.nextInt();
		
		System.out.println("Digite a nota do quarto bimestre");
		int bim4 = sc.nextInt();
		
		int media = (bim1 + bim2 + bim3 + bim4) / 4;
		
		if (media >= 7) {
			System.out.println("Aprovado");
		}
		
		else if (media <= 4 ){
			System.out.println("Reprovado");
		}
		
		else {
			System.out.println("Recuperacao");
		}

		
		
	}

}
