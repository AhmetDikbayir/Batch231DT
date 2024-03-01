package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 3, 5, 10, 10));
        tekrarsizTekSayiKupu(nums);

    }

    //1) Bir list’teki “tek sayi” olan elemanlarin “kup”lerini “tekrarsiz” olarak ayni satirda
    // aralarina bosluk koyarak yazdiran method’u olusturunuz.(Functional)

    //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir
    public static void tekrarsizTekSayiKupu(List<Integer> nums){
        nums.
                stream().
                distinct().
                filter(t->t%2 ==1).
                map(t->t*t*t).
                forEach(t-> System.out.print(t + " "));
    }





}
