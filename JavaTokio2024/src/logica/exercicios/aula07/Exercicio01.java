package logica.exercicios.aula07;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
        String jogar = "sim";
		
		while (jogar.equals("sim")) {
			System.out.println("Ola mundo");
			
			System.out.println("Deseja deseja exibir a mensagem novamente?");
			jogar = sc.nextLine();
		}
	}

}
