package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {
        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"
        */
        //charAt() methoduna index verince size karakteri getirir
        //break anahtar kelimesi, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";

        for (int i = 0;  i < s.length();  i++) {
            char ch = s.charAt(i);
            if (ch == 'a'){
                break;
            }
            System.out.print(ch); //Tr
        }

        //İkinci a da döngüden çıkan kod
        /*String s = "Tramvay";
        char ch = s.charAt(i);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch == 'a') {
                j++;
            }
            if(j==2){
                break;
            }
            System.out.print(ch);
        }
         */
        System.out.println("------------------------");
        //Ornek 2: Verilen bir String’de kucuk harfleri console’a yazdirmayan kodu yaziniz
        //“Pwd12?Ab” ==> P12?A

        String s1 = "Pwd12?Ab";

        for(int i = 0; i< s1.length(); i++){
            char ch1 = s1.charAt(i);

            if(ch1 < 'a' || ch1 > 'z'){
                System.out.print(ch1);
            }else{
                continue;
            }
            /*
            if(ch1 >= 'a' && ch1 <= 'z'){
                continue;
            }else{
                System.out.print(ch1);
            }
             */
        }
        System.out.println("----------------------------");

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz
        //           String t = "Ali Can";  ==> "naC ilA"
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1'tir


        String t = "Ali Can";
        String reversed = "";
            for (int i = t.length() - 1; i > -1; i--) {
                reversed = reversed + t.charAt(i);
            }
        System.out.println(reversed);

    }
}
