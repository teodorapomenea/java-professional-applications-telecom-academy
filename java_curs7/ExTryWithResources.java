package java_curs7;

public class ExTryWithResources{
   public static void main(String [] args) {
      try(DBConnection db1= new DBConnection();
          DBConnection db2 = new DBConnection();){
             //folosim resursele
      }catch(Exception e){
          // e = exceptia principala = prima exceptie care se arunca
          //dupa vor fi exceptii ascunse -> stocate intr-un vector de suppressed
          System.out.println(e.getMessage());
          Throwable [] suppressed = e.getSuppressed();
          for (Throwable t:suppressed) {
                System.out.println(t);
            }
          //tratez
      }finally{
        System.out.println("finally explicit");
        }
    }
}