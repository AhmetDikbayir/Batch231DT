package d25maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Deneme {
    public static void main(String[] args) {
        HashMap<String, Integer> stdNames = new HashMap<>();

        stdNames.put("Ali", 18);
        stdNames.put("Can", 19);
        stdNames.put("Tom", 33);
        stdNames.put("Veli", 63);
        stdNames.put("Ahmet", 41);
        stdNames.put("Jerry", 14);

//        Set<Map.Entry<String, Integer>> stdNamesSet = stdNames.entrySet();
//        for(Map.Entry<String, Integer> w: stdNamesSet){
//            if(w.getKey().trim().equalsIgnoreCase("aLi")){
//                stdNames.remove(w.getKey());
//            }
//        }
//
//        stdNames.remove("ahmet");
//        System.out.println(stdNames);

        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali bir kere gözüktü. Java diğerini Ali. olarak gördü.

        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasıl.sın geldi, nasılsın Ali.";

       String[] strArr = s.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");

       HashMap<String, Integer> myMap = new HashMap<>();



       for(String w : strArr){
           Integer occurance = myMap.get(w);
           if(occurance == null){
               myMap.put(w,1);
           }else {
               myMap.put(w, occurance+1);
           }
       }

        System.out.println(myMap);

    }
}
