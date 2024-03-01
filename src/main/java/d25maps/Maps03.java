package d25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali bir kere gözüktü. Java diğerini Ali. olarak gördü.

        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasılsın geldi Ali.";
        String[] arr = s.replaceAll("\\p{Punct}", "").toLowerCase().split(" ");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap);

        for(String w : arr){
            Integer occurance = myMap.get(w);
            if(occurance == null){
                myMap.put(w,1);
            }else{
                myMap.put(w, occurance+1);
            }
        }

        System.out.println(myMap);

        //--------------------ODEV
        //ornek 2: Size verilen bir String’deki her harfin o String’de kac defa kullanildigini gosteren kodu yaziniz.
        //      “Hello” ==> H=1, e=1, l=2, o=1

        String str = "Hel_alo ?aaoohh";
        String[] newStrArr = str.replaceAll("\\p{Punct}", "").replaceAll(" ", "").toLowerCase().split("");
        HashMap<String, Integer> myMap2 = new HashMap<>();

        for(String w : newStrArr){
            Integer occurance = myMap2.get(w);
            if(occurance == null){
                myMap2.put(w, 1);

            }else {
                myMap2.replace(w,occurance+1);
            }
        }

        System.out.println(myMap2);
    }
}
