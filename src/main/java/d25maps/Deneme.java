package d25maps;

import java.util.*;

public class Deneme {
    public static void main(String[] args) {
        HashMap<String, Integer> stdNames = new HashMap<>();

        stdNames.put("Ali", 18);
        stdNames.put("Can", 19);
        stdNames.put("Tom", 33);
        stdNames.put("Veli", 63);
        stdNames.put("Ahmet", 41);
        stdNames.put("Jerry", 14);


        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali bir kere gözüktü. Java diğerini Ali. olarak gördü.

        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasıl.sın geldi, nasılsın Ali.";

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Tom");

        Iterator<String> myItr = myList.iterator();

        while(myItr.hasNext()){
            String w = myItr.next();
            if(w.equalsIgnoreCase("tom")){
                myItr.remove();
            }
        }

//        System.out.println(myList);

        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){
            String str2 = yourListItr.next();
            if(str2.equalsIgnoreCase("can")){
                yourListItr.set(str2 + " *");
            }

        }

        System.out.println(yourList);
    }
}
