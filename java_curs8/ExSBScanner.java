import java.util.*;

public class ExSBScanner{
   public static void main (String [] args){
    Scanner s = new Scanner(System.in); // creez fluxul de citire de la tastatura
    System.out.println("Introdu numele tau: ");
    String line = s.nextLine();//citesc linia introdusa de catre utilizator
    StringBuilder sb = new StringBuilder();
    
    sb.reverse();
    System.out.println("Numele tau inversat este: "+ sb);
  }
}
