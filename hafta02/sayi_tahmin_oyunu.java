package hafta02;

import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_oyunu {
    public static void main(String[] args) {
        Random r = new Random();
        int uretilen = r.nextInt(100);
        //System.out.println(uretilen);
        int sayac=0;


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı tahmin et=");
        int tahmin = scan.nextInt();
        sayac++;

        while (true){
            if(tahmin>uretilen){
                System.out.println(sayac + ". deneme!");
                System.out.println("Daha küçük bir sayı gir:");
                tahmin = scan.nextInt();
                sayac++;
            } else if(tahmin<uretilen){
                System.out.println(sayac + ". deneme!");
                System.out.println("Daha büyük bir sayı gir:");
                tahmin = scan.nextInt();
                sayac++;
            } else {
                System.out.println("Tebrikler "+uretilen+" sayısını "+sayac +". denemede bildiniz!");
                break;
            }

        }



    }
}
