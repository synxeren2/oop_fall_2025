package hafta01;

import java.util.Scanner;

public class istenen_aralikta_istenen_sayinin_katları {
    public static void main(String[] args) {
        //kullanıcıdan alınan iki sayı aralığında
        //kullanıcıdan alınan sayının katlarını bulan programı yazınız
        Scanner scan = new Scanner(System.in);



        System.out.println("Aralık tabanını gir : ");
        int taban = scan.nextInt();
        System.out.println("Aralık tavanını gir : ");
        int tavan = scan.nextInt();
        System.out.println("Hangi sayının katlarını bulalım : ");
        int kat = scan.nextInt();

        for(int i=taban;i<tavan;i++){
            if(i%kat==0) System.out.print(i+" / ");
        }

    }
}
