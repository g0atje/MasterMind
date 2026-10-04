package mastermind;

import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {

	
	   String  codemaker; 
       String  codekraker; 
       String  code;
       String  kleur = " "; 
       String []  codekleuren;
       String []  kleuren = new String [4];
       
       
       int     positie = 0;
       int []  posities = new int [4];
       int     vak = 0;
       int     poging = 0;
       int     zwartePinnen = 0;
       int     wittePinnen = 0;
       
       boolean geraakt;
       boolean gekraakt; 
       
       
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Kies een codemaker:");
	   codemaker = scanner.nextLine();
	   
	   System.out.println("Kies een codekraker:");
	   codekraker = scanner.nextLine();
	   
	   System.out.println("Kies een code:");
	   code = scanner.nextLine();
	   codekleuren= code.split(",");
	   
	  
	   
	   while (vak < 4) {
	   System.out.println("Kies een kleur:");
	   kleur = scanner.nextLine();
	   
	   System.out.println("kies een positie 1 t/m 4:");
	   positie = scanner.nextInt();
	   scanner.nextLine();
	   
	   kleuren [vak] =kleur;
	   posities [vak] = positie;
	   
	   vak++;
	   
	   }
	   
	   vak = 0;
	   
	   while (vak < 4) {
	   
		   kleur = kleuren[vak];
		   positie = posities[vak];
		   
	  if (kleur.equals("rood")) { 
		  if (codekleuren[positie -1].equals("rood")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("rood")) {
	  		wittePinnen++;}
	    }
	
	  if (kleur.equals("groen")) { 
		  if (codekleuren[positie -1].equals("groen")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("groen")) {
	  		wittePinnen++;}
	   }
	  if (kleur.equals("geel")) { 
		  if (codekleuren[positie -1].equals("geel")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("geel")) {
	  		wittePinnen++;}
	    }
	  if (kleur.equals("oranje")) { 
		  if (codekleuren[positie -1].equals("oranje")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("oranje"))
	  		wittePinnen++;}
	   
	    
	  if (kleur.equals("blauw"))
		  if (codekleuren[positie -1].equals("blauw")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("blauw")) {
	  		wittePinnen++;}

	  
	
	  if (kleur.equals("paars")) {
		  if (codekleuren[positie -1].equals("paars")) {
	 		  zwartePinnen++; 
	  } else if (code.contains("paars")) {
	  		wittePinnen++;}
	    }
	  
	     vak++;
	     
	     }
	  
	  System.out.println("Zwarte pinnen: " + zwartePinnen);
	  System.out.println("Witte  pinnen: " + wittePinnen);
	

	  
}
}



	
	
 

