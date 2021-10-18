package java_curs8;

public class ExTipGeneric{
    public static void main(String [] args){
        Cutie c1;// o sa fie automat tipul generic Object
        Cutie<?> c2;// pot sa pun orice
        Cutie<Lego> c3;// constrangere directa
        Cutie<Integer> c4;
        Cutie<Number> c5;
        Cutie<? extends Number> c6;
        Cutie<?super Integer> c7;
        
        
        c2 = new Cutie (); // are val implicita de Object
        c2 = new Cutie<Lego>();
        c2 = new Cutie<Integer>();
        c2 = new Cutie<int[]>();// tip referinta (int[] este array)
        c4 = new Cutie<Integer>();
        c4 = new Cutie<>();//merge pt constrangere directa => sintaxa diamond Java7
        //c5 = new Cutie<Integer>(); - nu tine cont de polimorfism
        c6 = new Cutie <Integer>();
        c7 = new Cutie <Integer>();
        c7 = new Cutie <Object>();
        c7 = new Cutie <Number>();
        
        
    }
}
