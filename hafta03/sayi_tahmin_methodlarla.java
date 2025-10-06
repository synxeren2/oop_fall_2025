package hafta03;

import java.util.Random;
import java.util.Scanner;

public class sayi_tahmin_methodlarla {
    public static void main(String[] args) {
        int uretilen = randomSayi();
        int sayac = 0;

        int tahmin = sayiAl();
        sayac++;

        while (true){
            if(tahmin>uretilen){
                System.out.println(sayac + ". deneme!");
                System.out.println("Daha küçük bir sayı gir:");
                tahmin = sayiAl();
                sayac++;
            } else if(tahmin<uretilen){
                System.out.println(sayac + ". deneme!");
                System.out.println("Daha büyük bir sayı gir:");
                tahmin = sayiAl();
                sayac++;
            } else {
                System.out.println("Tebrikler "+uretilen+" sayısını "+sayac +". denemede bildiniz!");
                break;
            }

        }

    }





    static int randomSayi(){
        Random r = new Random();
        return r.nextInt(100);
    }

    static int sayiAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi tahmin et");
        int s = scan.nextInt();
        return s;
    }
}
