package java_curs8;

public class Lego implements Comparable<Lego>{
   String culoare;
   int nrPiese;
   
   public Lego(String culoare, int nrPiese) {
        this.culoare = culoare;
        this.nrPiese = nrPiese;
    }
   @Override
   public int compareTo(Lego l) {
       return this.nrPiese - l.nrPiese; 
   }
   
   public String toString(){
       return"culoare "+culoare+" nr.piese "+nrPiese;    
   }
}
