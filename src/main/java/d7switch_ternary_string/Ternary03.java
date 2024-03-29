package d7switch_ternary_string;

public class Ternary03 {
    public static void main(String[] args) {
        /*
               1) Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2) Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        */
        int year = 1500;
        String result = (year % 100 == 0) ?
                ((year % 400 == 0) ? ("Leap Year"): ("Not Leap Year")) :
                ((year % 4 == 0) ? ("Leap Year") : ("Not Leap Year"));
        System.out.println(result);
    }
}
