package d27exceptions;

public class E06 {
    public static void main(String[] args) {
        //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur

        String s = "Java";
        karakterSayisi(s);

        String a = "";
        karakterSayisi(a); // 0 verir.

        String u = null;
        karakterSayisi(u); // NullPointerException fırlatır
    }

    public static void karakterSayisi(String s){
        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("Null değeriyle length metodunu kullanmayınız");
        }
    }
}
