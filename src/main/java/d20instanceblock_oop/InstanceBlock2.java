package d20instanceblock_oop;

public class InstanceBlock2 {
    public int year;

    //Instance block
    {
        System.out.println("Herkese selam");
    }


    public InstanceBlock2() {
        //System.out.println("Herkese selam"); Instance block tanımlandığı için silinir.
    }

    public InstanceBlock2(int year) {
        //System.out.println("Herkese selam"); Instance block tanımlandığı için silinir.
        this.year = year;
    }
}
