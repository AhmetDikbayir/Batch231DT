package d11loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Şeklin satır sayısını giriniz:");
        int satir = input.nextInt();

        System.out.println("Şeklin sütun sayısını giriniz:");
        int sutun = input.nextInt();

        for(int i=0; i<satir;i++){
            for(int j=0; j<sutun;j++){
                System.out.print("X ");
            }
            System.out.println();
        }

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */
        System.out.println("Lütfen satır sayısını yazınız: ");
        int satir2 = input.nextInt();
        for(int i=0; i<satir2;i++){
            for(int j=0; j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
