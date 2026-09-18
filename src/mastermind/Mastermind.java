package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	   String  codemaker; 
       String  codekraker; 
       String  code;
       String  kleur; 
       
       int     positie;
       int     vak;
       int     poging;
       int     zwartePinnen;
       int     wittePinnen;
       
       boolean geraakt;
       boolean gekraakt; 
       
       
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Kies een codemaker:");
	   codemaker = scanner.nextLine();
	   System.out.println("Kies een codekraker:");
	   codekraker = scanner.nextLine();
	   System.out.println("Kies een code:");
	   code = scanner.nextLine();
	   System.out.println("Kies een kleur:");
	   kleur = scanner.nextLine();
	   System.out.println("kies een positie 1 t/m 4:");
	   positie = scanner.nextInt();
	   
		
		
	}

}
