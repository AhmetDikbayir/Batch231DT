package d14array_arraylist;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Cok boyutlu dizi (MultiDimensional Array) temel olarak Array'in içine Array koymak anlamına gelir.
        // En yaygın örneği iki boyutlu dizilerdir, ki bunlar genellikle matris olarak düşünülebilir.
        // İki boyutlu bir dizi, satır ve sütunlardan oluşur, tıpkı bir Excel tablosu gibi.

        //MultiDimensional Array nasil olusturulur?

        int[][] a = new int[3][2]; //3 dıstaki, 2 içteki eleman sayısı

        //MultiDimensional Array’lere nasil eleman eklenir?
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 5;

        //MultiDimensional Array konsola nasil yazdirilir?

        System.out.println(Arrays.toString(a)); //[[I@1b28cdfa, [I@eed1f14, [I@7229724f]

        //MultiDimensional Array’leri yazdirirken toString() degil, deepToString() method’u kullaniriz

        System.out.println(Arrays.deepToString(a));

        //MultiDimensional Array’den spesifik bir eleman nasil yazdirilir?

        System.out.println(a[1][1]);

        //MultiDimensional Array icindeki bir Array nasil yazdirilir?

        System.out.println(Arrays.toString(a[2]));

        //Kisa yoldan MultiDimensional Array nasil olusturulur?

        String[][] students = {{"Ali", "Kemal"}, {"Cemal"}, {"Ayhan", "Beyhan", "Seyhan"}, {"Ceyhan", "Burhan"}};

        System.out.println(Arrays.deepToString(students));

        //Ornek 1: Yukaridaki students array’inde toplam kac isim oldugunu bulunuz.
        int sum = 0;
        for(String[] w : students){
            sum +=w.length;
        }
        System.out.println(sum); //8

        //students MD Arrayindeki bütün karakterleri bulan kodu yazınız.
        int totalChar = 0;
        for(String[] w : students){
            for(String k : w){
                totalChar += k.length();
            }
        }
        System.out.println(totalChar);


        //İçindeki bütün elemanları teker teker yazdırmak için.

        for(String[] student : students){
            for(int i = 0; i<student.length; i++){
                System.out.println(student[i]);
            }
        }

         /*
        System.out.println("-----------------------");
        for(String[] student: students){
            for(String w : student){
                System.out.println(w);
            }
        }


         */

        System.out.println("-------------------------");


        //Ornek 2: Yukaridaki students Array’inde icinde “m” olan isimleri console’a yazdiriniz
        for(String[] student : students){
            for(String i : student){
                if(i.contains("m")){
                    System.out.println(i);
                }
            }
        }



    }
}
