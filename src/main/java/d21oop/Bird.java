package d21oop;

public class Bird extends Animal {
    public void tweet(){
        System.out.println("Bird tweet...");
    }

    @Override
    public void drink(){
        System.out.println("Birds drink...");
    }

    @Override
    public void eat(){
        System.out.println("Birds eat...");
    }
}
