public class Pisica{
   String nume;
   int varsta;
   
   @Override
   public boolean equals(Object o) {
       if(o == null) return false;
       if(o instanceof Pisica) {
            Pisica p = (Pisica) o ;
            return this.varsta == p.varsta;
       }
       return false;
   }
   
   @Override 
   public String toString(){
    return "nume: "+this.nume+" varsta: "+this.varsta;
    }
}







