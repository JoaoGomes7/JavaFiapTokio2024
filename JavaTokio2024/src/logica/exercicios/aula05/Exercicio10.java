package logica.exercicios.aula05;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Quantos anos voce tem?");
	    int anos = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Faz quantos meses completos que voce comemorou seu ultimo aniversario?");
	    int meses = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Quantos dias se passaram apos o termino do mes passado?");
	    int dias = Integer.parseInt(sc.nextLine());
	    
	    int DiasAnos = anos * 365;
	    int DiasMeses = meses * 30;
	    int DiasVividos = DiasAnos + DiasMeses;
	    int DiasFinal = DiasVividos + dias;
	    
	    System.out.println("Voce viveu " + DiasFinal + " dias ate o momento.");
	    

	}

}
