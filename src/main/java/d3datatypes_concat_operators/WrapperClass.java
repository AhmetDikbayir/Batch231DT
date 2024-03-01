package d3datatypes_concat_operators;

public class WrapperClass {
    public static void main(String[] args) {
        /*Java primitive data tiplerine yeni ozellikler(methodlar) ekleyerek yeni bir yapi olusturdu.
        Bu yapiya wrapper class denir. Wrapper sınıflar, Java'nın primitif veri türlerini object olarak
        temsil etmek için kullandığı class'lardir. Bu özellik, primitive veri türlerini koleksiyonlarda
        (örneğin ArrayList gibi) kullanabilmek için oldukça kullanışlıdır, çünkü Java'da koleksiyonlar
        sadece Object referans türlerini kabul eder.

        Ayrica en onemlisi girdigimiz veriler uzerinde
        method kullaniminin da yolunu acar.*/

        //Wrapper'lar buyuk harfle baslarlar cunku class'tirlar.
        // primitive    : char      - boolean - byte - short - int     - long - float - double
        //wrapper class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

        int i = 12;
        //i. yapınca metot açılmaz. Metotların başında m yazar.

        Integer k = 12;
        //k. yapınca metotlar açılır. Burası class'tır. Classtan bir obje oluşturmuş olduk.

        //Ornek 1 : primitive int’i wrapper Integer’a ceviriniz (Autoboxing)

        int num = 13;
        Integer wrapperNum = num;

        //Ornek 2 : Wrapper Byte’i primitive byte’a ceviriniz (Unboxing)

        Byte s = 19;
        byte primitiveS = s;

    }
}
