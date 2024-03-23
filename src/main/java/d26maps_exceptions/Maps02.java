package d26maps_exceptions;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {

        //HasMap arka planda nasil calisiyor?

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");
        System.out.println(capitals.get("USA"));
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");
        System.out.println(capitals.get("Turkiye"));

        capitals.put("Turkiye", "Istanbul");
        System.out.println(capitals.get("Turkiye"));

    }
}
