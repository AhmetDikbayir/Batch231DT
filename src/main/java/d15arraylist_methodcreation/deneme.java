package d15arraylist_methodcreation;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class deneme {
    public static void main(String[] args) {
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(24);
        list.add(12);
        list.add(9);
        list.add(3);
        System.out.println(list);

        for(int w : list){
            if(w%2==1){
                list.set(list.indexOf(w),11);
            }
        }
        System.out.println("list = " + list);

        //Ornek 2: Listenin elemanlarını tersten yazdırınız


        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);

        LinkedList<Integer> reversedList = new LinkedList<>();

        for(Integer w : myList){
            reversedList.add(0, w);
        }

        System.out.println("reversedList = " + reversedList);

        //Ornek 3: Tekrarli elemanlari olan bir listten, tekrarsiz elemanlari olan bir list elde ediniz.
        //           [J, a, v, a, v] ==> [J, a, v]

        LinkedList<Character> a = new LinkedList<>(Arrays.asList('J', 'a', 'v', 'V', 'A', 'a', 'c', 'c'));
        LinkedList<String> b = new LinkedList<>();

        for(Character w : a){
            String x = String.valueOf(w);
            if(!b.contains(x.toLowerCase())){
                b.add(x);
            }
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Ornek 4:  Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Ahmet");
        strList.add("Ayse");
        strList.add("Bulent");
        strList.add("Deniz");
        strList.add("Fatma");

        for(int i = 0; i< strList.size(); i++){
            if(strList.get(i).toLowerCase().contains("a")){
                strList.remove(i);
                i--;
            }
        }
        System.out.println("strList = " + strList);

//        ArrayList<String> newStrList = new ArrayList<>();
//
//        for(String w : strList){
//            if(!w.toLowerCase().contains("a")){
//                newStrList.add(w);
//            }
//        }
//        System.out.println("strList = " + strList);
//        System.out.println("newStrList = " + newStrList);

        //Ornek 1: Bir tane Integer List olusturunuz.
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //           [12, 23, 10, 19] ==> 12 ve 10

        ArrayList<Integer> k = new ArrayList<>();
        k.add(5);
        k.add(9);
        k.add(10);
        k.add(47);

        k.sort(null);
        System.out.println("k = " + k);

        int minFark = k.get(1) - k.get(0);
        for(int i = 1; i< k.size();i++){
            if(k.get(i)-k.get(i-1)<minFark){
                minFark = k.get(i) - k.get(i-1);
            }
        }
        System.out.println("minFark = " + minFark);

        for(int i = 1; i<k.size(); i++){
            if(minFark == k.get(i)-k.get(i-1)){
                System.out.println("Minimum farka sahip olan elemanlar " + k.get(i) + " - " + k.get(i-1) + " elemanlarıdır.");
            }
        }

        LocalDate past = LocalDate.of(2011,4,4);
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today);
        System.out.println("past = " + past);
        System.out.println(today.isBefore(past));
        YearMonth yMonth = YearMonth.of(2021, Month.valueOf("JUNE"));
        System.out.println(yMonth.lengthOfMonth());

        System.out.println("------------------");

        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(13);
        sb.insert(5,"aLi");
        sb.reverse();

        System.out.println(sb.capacity());
        System.out.println("sb = " + sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.insert(2,"kkkkk");
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());

    }

}
