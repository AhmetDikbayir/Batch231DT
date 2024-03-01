package d27exceptions;

public class E04 {
    public static void main(String[] args) {
        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j","a","v", "a"};
        getElementFromArray(arr, 4);
    }

    public static void getElementFromArray(String[] s, int idx){
        try {
            String element = s[idx];
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("index numarası " + (s.length-1) + " den büyük olamaz!");
        }
    }
}
