package java_curs7;

public class ExResursa{
   public static void main(String [] args) {
      DBConnection db1 = null;
      DBConnection db2 = null;
      try{
             db1= new DBConnection();
             db2 = new DBConnection();
             //folosim resursele
      }catch(Exception e){
        //tratez
      }finally{
        if (db1!=null) {db1.close();}
        if (db2!=null) {db2.close();}
      }
    }
}
