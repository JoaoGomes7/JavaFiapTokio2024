package logica.exercicios.aula06;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 7;
		int c = 4;
		int d = 8;
		
		boolean verifica = (a <= b) && (b < d);
		System.out.println(verifica);
		
		boolean verifica2 = (a == b) || (c != b);
		System.out.println(verifica2);
		
		boolean verifica3 = (d > a) && (c >= b);
		System.out.println(verifica3);
		
		boolean verifica4 = (a <= b) || (c <= d);
		System.out.println(verifica4);
		
		boolean verifica5 = ((b > c) || (c < a)) && (d <= b);
		System.out.println(verifica5);
		
		
		
		

	}

}
