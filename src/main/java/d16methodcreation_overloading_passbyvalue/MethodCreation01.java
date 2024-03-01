package d16methodcreation_overloading_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {

        /*
            Javada Method Oluşturma: Java da bir method (örneğin main metodu) içinde başka bir metot tanımlanamaz.
            Ancak bir metot içinde (mesela main) bir iç class (nested class veya inner class) tanımlanabilir.
            ve bu iç class'ın içinde metotlar kullanılabilir. Ancak LocalInnerClass yalnızca main metodu içinde geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz.
         */
        /*
        Method Creation - Metot Oluşturma

        Java da metot nasıl oluşturulur?

        1-main method'un disinda, class in içinde oluşturulur
        2-Syntax'i: Access Modifier + Return Type + Method ismi + () + {}
        3- Oluşturulan method nasıl kullanılır?
            Main metot içinden method çağrısı yapılmalıdır. Buna method call denir.
         */

        System.out.println(sum(2,5));
        int result = sum(3,7);
        System.out.println(result);
    }
    //main disi
    //örnek 1: Toplama yapan bir method oluşturunuz.

    public static Integer sum(int a, int b){
        return a+b;
    }
}
