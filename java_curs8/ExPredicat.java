package java_curs8;

public class ExPredicat
{
    public static void main (String [] args){
        Predicat<String> p = new Predicat<>(){
            @Override
            public boolean test(String s){
             return s.length()% 2==0; 
            }
              
        };
    
        Predicat<Integer> pred = x -> x>5;
        Predicat<Lego> predLego = l -> l.culoare.equals("rosu");
    }
}
