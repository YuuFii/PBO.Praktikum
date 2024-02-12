package PBO.Collection.TreeSet;
import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> al = new TreeSet<String>();

        al.add("Putra");
        al.add("Adi");
        al.add("Tari");
        al.add("Syila");
        al.add("Diah");

        System.out.println("First : " + al.first());
        System.out.println("Last  : " + al.last());

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
