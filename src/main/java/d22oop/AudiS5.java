package d22oop;

public class AudiS5 implements Motor, Klima, Fren {
    //ODEV: AudiS5 class'i olusturup, coklu parent'a child yapsin


    public void eco() {
        System.out.println("Audi S5 eco motor kullanır.");
    }

    public void turbo() {
        System.out.println("Audi S5 turbo motor kullanır.");
    }

    public void gas() {
        System.out.println("Audi S5 benzinli motor kullanır.");
    }

    public void abs() {
        System.out.println("Audi S5 abs fren kullanır.");
    }

    public void esp() {
        System.out.println("Audi S5 esp fren kullanır.");
    }

    public void analog() {
        System.out.println("Audi S5 analog klima kullanır.");
    }

    public void digital() {
        System.out.println("Audi S5 digital klima kullanır.");
    }
}
