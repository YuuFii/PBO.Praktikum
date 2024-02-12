package PBO.Collection;

import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> list = new java.util.ArrayList<String>();

        list.add("Adi");
        list.add("Putra");
        list.add("Tari");
        list.add("Syila");

        java.util.ArrayList<String> list1 = new java.util.ArrayList<String>();

        list1.add("Tari");
        list1.add("Syila");

        list.removeAll(list1); // Menghapus data pada "list" yang datanya sama dengan "list1"
        list.clear(); // Menghapus semua data pada "list"


        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator<String> itr1 = list1.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
    }
}
