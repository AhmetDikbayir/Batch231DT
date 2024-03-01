package d5increment_decrement_if;

public class IncrementDecrement {
    public static void main(String[] args) {

        //----------------Increment
        int a = 5;
        a = a + 2; //a iki defa yazilmis. Tekrardan kurtulabiliriz
        System.out.println(a); //7

        a += 2; //a = a + 2; nin aynısıdır.
        System.out.println("a = " + a);

        //----------------Decrement
        int c = 10;
        c = c - 3; ////c iki defa yazilmis. Tekrardan kurtulabiliriz
        System.out.println("c = " + c);

        c -= 4;
        System.out.println("c = " + c);

        //----------------Çarpma
        int d = 6;
        d = d * 2;
        System.out.println("d = " + d);

        d *= 2;
        System.out.println("d = " + d);

        //----------------Bölme
        int e = 24;
        e = e / 2;
        System.out.println("e = " + e);

        e /= 2;
        System.out.println("e = " + e);

        //----------------1 ile increment
        int f = 13;
        f = + f+1;
        System.out.println("f = " + f);

        f +=1;
        System.out.println("f = " + f);

        f++;
        System.out.println("f = " + f);

        //----------------1 ile decrement
        int g = 15;
        g = g-1;
        System.out.println("g = " + g);

        g-=1;
        System.out.println("g = " + g);

        g--;
        System.out.println("g = " + g);

        //----------------Post increment (i++), pre increment (++i)
        int i = 10;
        int k = i++;

        System.out.println(k); //10
        System.out.println(i); //11

        int m = 15;
        int n = ++m;

        System.out.println(n); //16
        System.out.println(m); //16

        //----------------Post decrement (i--), pre decrement (--i)
        int s = 20;
        int t = --s;

        System.out.println("t = " + t);
        System.out.println("s = " + s);




    }
}
