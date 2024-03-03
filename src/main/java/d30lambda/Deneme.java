package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Deneme {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        eHaric(myList);
    }

    public static void eHaric(List<String> myList){
        myList.stream().filter(t->!t.toLowerCase().startsWith("e")).forEach(t-> System.out.println(t));
    }




}


