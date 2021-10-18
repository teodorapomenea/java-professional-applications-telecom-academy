package java_curs8;

import java.util.*;
public class ExTreeSet{
    public static void main(String [] args){
         Set<Integer> set = new TreeSet<>();
         //Set -> colectie care  nu e ordonata(nu mai pastreaza ordinea de adaugare)
         //NU permite duplicate
         //TreeSet este o colectie sortata
         set.add(34);
         set.add(56);
         set.add(34);
         set.add(70);
         set.add(90);
         set.forEach(System.out::println);
        //COMPARATORUL ARE PRIORITATE 
         Comparator<Lego> c = new Comparator<>() {
          @Override
          public int compare(Lego l1, Lego l2){
            return l1.culoare.compareTo(l2.culoare);
          }
            
        };
        TreeSet<Lego> treeSet = new TreeSet<>();
         TreeSet<Lego> treeSet1 = new TreeSet<>(c);
          TreeSet<Lego> treeSet2 = new TreeSet<>((l1,l2)->l1.culoare.compareTo(l2.culoare));
         treeSet.add(new Lego("rosu",20));
         treeSet.add(new Lego("negru",10));
         treeSet.add(new Lego("verde",30));
          treeSet.add(new Lego("alb",100));
         treeSet.forEach(System.out::println);
       
    }
}


