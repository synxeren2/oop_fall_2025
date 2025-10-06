package hafta03;

import java.util.Scanner;

class Ucgen{
    //global değişkenler
    int taban;
    int a,b,c;
    int yukseklik;



    Ucgen(){ //constructer method sınıf ismi aynı olmalı
        //this bu sınıftaki değişkeni ifade eder;
        //int a,b,c; //local a,b,c
        //a= 13; // burada local a değişkenine atama yapılır
        this.a = 5;
        this.b = 4;
        this.c = 3;
        this.yukseklik = 4;
        this.taban = 3;
    }

    Ucgen(int a,int b,int c, int yukseklik, int taban){ //aynı isimli constructer overload edildi
        //yapıcı method çalışırken kullanıcıdan alınan nitelikler sınıfın global niteliklerine aktarılır
        this.a = a;
        this.b = b;
        this.c = c;
        this.yukseklik = yukseklik;
        this.taban = taban;
    }


    float alan(Ucgen u){
        return (float) u.taban*u.yukseklik/2;
    }

    int cevre(Ucgen u){
        return  u.a + u.b + u.c;
    }
}










public class constructer_yapici_methodlar {
    public static void main(String[] args) {
        Ucgen u1 = new Ucgen();

        System.out.println("Çevre ="+u1.cevre(u1));
        System.out.println("Alan = "+u1.alan(u1));

        Ucgen u2 = new Ucgen(7,11,14,8,11);
        System.out.println("Çevre ="+u2.cevre(u2));
        System.out.println("Alan = "+u2.alan(u2));

        Scanner scan = new Scanner(System.in);
        System.out.println("a kenarını gir :");
        int a = scan.nextInt();
        System.out.println("b kenarını gir :");
        int b = scan.nextInt();
        System.out.println("c kenarını gir :");
        int c = scan.nextInt();
        System.out.println("yuksekliği gir :");
        int y = scan.nextInt();
        System.out.println("tabanı gir :");
        int t = scan.nextInt();
        Ucgen u3 = new Ucgen(a,b,c,y,t);
        System.out.println("Çevre ="+u3.cevre(u3));
        System.out.println("Alan = "+u3.alan(u3));

    }
}
