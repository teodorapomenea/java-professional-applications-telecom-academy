public class ExTryFinally
{
   public static void main(String [] args){
        try{ 
            System.out.println("A");
            if(1==1) throw new MyRuntimeException();
            System.out.println("B");
        } finally{
            System.out.println("C");
        }
    }
}
