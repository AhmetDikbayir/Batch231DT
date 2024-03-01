package d12loops_arrays;

public class WhileLoops03 {
    public static void main(String[] args) {
        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //      Palindrome: 121 <==> 121    123321 <==> 123321

        int k = 53135;
        String m = String.valueOf(k);
        String reversed = "";

        int n = m.length()-1;

        while (n>=0){
            reversed += m.charAt(n);
            n--;
        }
        System.out.println(reversed);

        if(m.equals(reversed)){
            System.out.println("Palindromdur.");
        }else{
            System.out.println("Palidrom değildir.");
        }

    }
}
