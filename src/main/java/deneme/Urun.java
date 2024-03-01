package deneme;

import d22oop.Honda;

public class Urun implements Odeme, Kargo, Paket {


    public void krediKart(){
        System.out.println("Kredi kartı ile ödendi.");
    };

    public void nakit(){
        System.out.println("Nakit ile ödendi.");
    };

    public void hediyePak(){
        System.out.println("Hediye paketi yapılarak yollandı");
    };

    public void normalPak(){
        System.out.println("Normal paket şeklinde yollandı");
    };

    public void yurtIci(){
        System.out.println("Yurt içi kargo ile yollandı");
    };

    public void pttKargo(){
        System.out.println("PTT kargo ile yollandı");
    };

}
