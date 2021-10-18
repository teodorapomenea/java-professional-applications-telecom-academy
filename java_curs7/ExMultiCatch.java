public class ExMultiCatch{
       public static void main(String [] args) {
           try {
                System.out.println("A");
                m(50);
                System.out.println("B");
            }catch(NotEnoghMoneyException|AnotherException e){
             System.out.println("C");     
            }
    }
    
    public static void m(int x) throws NotEnoghMoneyException, AnotherException{
        if(x>100)  {
            throw new NotEnoghMoneyException();
        }
        if(x<10) {
            throw new AnotherException();
        }
    }
}
