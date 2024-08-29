package logica.exercicios.aula05;
import java.util.Scanner;
public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual peca sera comprada?");
		String peca1 = sc.nextLine();
		
		System.out.println("Qual numero de "+peca1+"s serao comprados?");
		double numPeca1 = Double.parseDouble(sc.nextLine());
		System.out.println("Qual o valor unitario dessa peca?");
		double precoPeca1 = Double.parseDouble(sc.nextLine());
		
		double ValorTotal1 = precoPeca1 * numPeca1;
		System.out.println("O valor total de "+peca1+"s sera:" + ValorTotal1);
		
		
		System.out.println("  ");
		
		System.out.println("Qual e a segunda peca que sera comprada?");
		String peca2 = sc.nextLine();
		
		System.out.println("Qual numero de "+peca2+"s serao comprados?");
		double numPeca2 = Double.parseDouble(sc.nextLine());
		
		System.out.println("Qual o valor unitario dessa peca?");
		double precoPeca2 = Double.parseDouble(sc.nextLine());
		
		double ValorTotal2 = precoPeca2 * numPeca2;
		System.out.println("O valor total de "+peca2+"s sera:" + ValorTotal2);
		
		System.out.println("  ");
		
		double precoFinal =  ValorTotal2 + ValorTotal1;
		
		System.out.println("O preco de todas as peças sera: " + precoFinal + ".");
		
		sc.close();
		

	}

}
