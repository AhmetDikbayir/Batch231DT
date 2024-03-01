package d24collections;

import java.util.*;

public class Deneme {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(2);
        myQueue.add(56);
        myQueue.add(3);
        myQueue.add(24);
        myQueue.add(21);
        //System.out.println("myQueue = " + myQueue);

        Queue<Integer> myQueue2 = new LinkedList<>();
        myQueue2.add(27);
        myQueue2.add(6);
        myQueue2.add(9);
        myQueue.addAll(myQueue2);

        //System.out.println(myQueue);

        ArrayDeque<String> hastaIsim = new ArrayDeque<>();
        ArrayDeque<String> hastaSoyisim = new ArrayDeque<>();
        hastaIsim.add("Ali");
        hastaIsim.add("Tom");
        hastaIsim.add("Veli");
        hastaIsim.add("Fatma");
        hastaIsim.add("Ayse");
        hastaSoyisim.add("Can");
        hastaSoyisim.add("Yılmaz");
        hastaSoyisim.add("Kale");
        hastaSoyisim.add("Ceren");
        hastaSoyisim.add("Deren");

        HashMap<HashMap<Integer, String>,String>doktor = new HashMap<>();

        HashMap<Integer, String> doktorBilgileri = new HashMap<>();
        doktorBilgileri.put(1, "Ali,Can, Allergist");
        doktorBilgileri.put(2, "Tommy,Hilfiger,Allergist");
        doktorBilgileri.put(3, "Johnson, Abel, Norolog");
        doktorBilgileri.put(4, "Jim, Geremy, General Surgeon");
        doktorBilgileri.put(5, "Emma, Babel, Norolog");
        doktorBilgileri.put(6, "Jerry, Daniel, Pediatric");




        System.out.println(doktor.entrySet());


        //System.out.println(myEntrySet);

        System.out.println("--------------------");
        System.out.println(doktor);
        Collection<String> veri = doktor.values();

        System.out.println(veri);

//        System.out.println(hastaIsim);
//        System.out.println(hastaSoyisim);



    }
}
