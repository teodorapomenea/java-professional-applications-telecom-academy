package java_curs7;

public class DBConnection  implements AutoCloseable{
 public DBConnection(){
     open();
    }
    
    private void open() {
        System.out.println("S-a deschis conexiunea");    
    }
    
    @Override
    public void close()
    {
        System.out.println("S-a inchis conexiunea");
    }
    
}
