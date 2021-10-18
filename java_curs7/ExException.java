package java_curs7;

public class ExException
{
    public static void main (String [] args) {
     System.out.println("Se incearca extragerea...");
       try {
              extragereNumerar(1000);
              System.out.println("Extragerea a fost reusita!"); 
       }catch(NotEnoghMoneyException e){
          System.out.println("Extragere nereusita.");
        }
    }
    
    public static void extragereNumerar(double suma) throws  NotEnoghMoneyException  {
        if(suma>500) {
             NotEnoghMoneyException e = new  NotEnoghMoneyException() ;
             throw e;//arunc instanta de exceptie(semnalez aparitia ei in aplicatie)
        }
    
    }
}
