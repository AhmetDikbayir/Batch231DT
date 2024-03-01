package d21oop;

public class Dog extends Mammal {

    public void bark(){
        System.out.println("Dogs bark...");
    }

    @Override
    public void drink(){
        System.out.println("Dogs drink...");
    }

    @Override
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){//Data type Animaldır

        //Yeni bir obje üretme böyle de yapılabiliyor
        return new Dog(); //Dog urettik, disari Animal verdik
        //cunku parent'in data tipi child'in data tipini kapsar
    }

    //bu tarz bir kod ya daha sonra override edilecek onun yazılmıştır ya da eğitim amaçlıdır.
    @Override
    public int add(int a, int b) {
        return a+b;
        //primitvelerde return type değiştirilemez.
        //Çünkü burada parent-child ilişkisi yoktur
    }

//    @Override
//    public Integer carpma(Integer a,  Integer b){
//        return a*b;
//    }


    @Override
    public Integer carpma(Integer a, Integer b) {
        Integer sonuc = super.carpma(a, b);

        //ek işlevsellik katalım
        return sonuc +10;
    }
}
