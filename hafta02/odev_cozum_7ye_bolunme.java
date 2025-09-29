package hafta02;

//3. Kullanıcıdan alınan iki sayı aralığında 7'ye tam bölünen sayıların adedi,
// toplamı ve ortalamasını bulduran programı yazınız?

import java.util.Scanner;

public class odev_cozum_7ye_bolunme {
    public static void main(String[] args) {
        int  taban,tavan,adet,toplam,i;
        float ort;
        adet = toplam = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz=");
        taban = scan.nextInt();
        System.out.println("Tavan sayısını giriniz=");
        tavan = scan.nextInt();

        for(i=taban;i<tavan;i++){
            if(i%7==0){
                System.out.print(i+"-");
                adet++;
                toplam+=i;
            }
        }

        System.out.println();
        System.out.println("Adet = "+adet);
        System.out.println("Toplam = "+toplam);
        ort  = (float) toplam/adet;
        System.out.println("Ortalama = "+ort);

    }
}
