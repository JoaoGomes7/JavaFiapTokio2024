package logica.exercicios.aula05;

import java.util.Scanner;

public class DesafioAula05 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
	    System.out.println("Quantos dias voce viveu na sua vida ate o momento?");
	    int DiasVividos = Integer.parseInt(sc.nextLine());
	    
	   int anos = DiasVividos / 365;
	    
	   int DiasRAnos = DiasVividos - (anos * 365);
	   
	   int meses = DiasRAnos / 30;
	   
	   int dias = DiasRAnos - (meses * 30);
	   
	   
	    System.out.println("Voce tem " + anos + " anos, " + meses + " meses e " + dias + " dias de vida." );
	    
	   
	    
		

	}

}
