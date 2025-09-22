package hafta01;

import java.util.Scanner;

public class kullanicidan_veri_almak {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        /*System.out.println("a sayısını giriniz : ");
        a = scan.nextInt(); //integer okurken nextInt();


        System.out.println("b sayısını giriniz : ");
        b = scan.nextInt();

        int toplam = a + b;
        System.out.println("a ve b sayılarının toplamı = " + toplam); */

        //string okuyalım
        String isim;
        /*System.out.print("İsminizi giriniz = "); // burada println yerine print kullandık ki giriş hemen yanına olsun yeni bir line atamasın
        isim = scan.next(); //boşluğa kadar metin satırını okur
        System.out.println(isim); */

        System.out.print("İsminizi giriniz = ");
        isim = scan.nextLine(); //boşluklar dahil tüm metin satırını okur
        System.out.println(isim);


    }
}
