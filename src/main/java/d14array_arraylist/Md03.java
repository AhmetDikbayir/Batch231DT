package d14array_arraylist;

public class Md03 {
    public static void main(String[] args) {
        //Ornek 1: int turunde bir Multidimensional Array’deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int [][] ages = {{15, 4}, {12, 43, 21}};
        int minVal = ages[0][0];
        int maxVal = ages[0][0];

        for(int[] w : ages){
            for(int i : w){
                minVal = Math.min(i, minVal);
                maxVal = Math.max(i, maxVal);
            }
        }

        System.out.println(minVal +maxVal);
    }
}
