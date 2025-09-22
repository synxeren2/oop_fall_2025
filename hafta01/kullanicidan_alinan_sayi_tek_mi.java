package hafta01;

import java.util.Scanner;

public class kullanicidan_alinan_sayi_tek_mi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Bir sayi giriniz = ");
        int sayi = scan.nextInt();




        if(sayi%2==0) {
            System.out.println("Girdiğiniz sayı çifttir");
        } else {
            System.out.println("Girdiğiniz sayı tektir");
        } //if else bloğu sonu


        //kullanıcıdan alınan sayı 50 den büyükse ve çiftse ekrana true
        //değilse false yazan programı yazınız? */
        boolean durum=false;

        System.out.print("Bir sayi giriniz = ");
        int a = scan.nextInt();
        if(a%2==0 && a>50) durum = true; else durum=false; //tek satır bloklarda süslü parantez kullanılmayabilir

        System.out.println(durum);

    } //main method sonu
} // class sonu
