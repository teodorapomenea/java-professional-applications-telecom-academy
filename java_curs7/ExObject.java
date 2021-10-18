public class ExObject
{
    public static void main(String [] args) {
        Pisica p = new Pisica();
        p.nume="Lea";
        p.varsta=5;
        System.out.println(p);
        Pisica q = new Pisica();
        q.nume = "Tina";
        q.varsta = 2;
        Kit k = new Kit();
        k.nume = "Tina";
        k.varsta = 2;
        k.stapan = "Ana";
        System.out.println(p.equals(q));
        System.out.println(q.equals(p));
        System.out.println(p.equals(k));
         System.out.println(q.equals(k));
         System.out.println(k.equals(q));
         System.out.println(k.equals(p));
    }
}
