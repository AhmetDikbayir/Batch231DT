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

        System.out.println(stdNames);

        Set<Map.Entry<String, Integer>> myMapEntry = stdNames.entrySet();
        System.out.println(myMapEntry);

        int sum = 0;
        for (Map.Entry<String, Integer> w : myMapEntry){
            if(w.getKey().length()>3){
                sum += w.getValue();
            }
        }
        System.out.println(sum);


        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali bir kere gözüktü. Java diğerini Ali. olarak gördü.

        //ali=2, nasilsin=1 ==> Bu map yapisi

//        String s = "Ali nasıl.sın geldi, nasılsın Ali.";
//
//        List<String> myList = new ArrayList<>();
//        myList.add("Ali");
//        myList.add("Tom");
//        myList.add("Jim");
//        myList.add("Clara");
//        myList.add("Fatma");
//        myList.add("Tom");
//        System.out.println(myList);
//
//        ListIterator<String> listItr = myList.listIterator();
//
//        while(listItr.hasNext()){
//            listItr.next();
//        }
//        while (listItr.hasPrevious()){
//            String st2 = listItr.previous();
//            System.out.print(st2 + "<--");
//        }
    }
}
