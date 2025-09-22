package hafta01;

public class degiskenler {
    public static void main(String[] args) {
        // tam sayı = integer değişkenler
        int  a = 5;
        int  b = 8;
        int c = a+b;
        System.out.println("a ve b sayılarının toplamı = "+c);

        int x,y,z;
        x = y = 8;
        z = x*y;
        System.out.println(x+"*"+y+" = "+z);

        float k;  //kesirli sayı
        k = (float)3.14;  // yada  k = 3.14f; ile casting yapılır
        System.out.println("k = "+k);
        k = 1.66f;
        System.out.println("k = " + k);

        String metin = "Stringler aslında karakterlerin birleşmiş halidir";
        System.out.println(metin);

        char m = 'a'; //tek karakter tanımlarken kullanılır
        char n = ' '; // charlar tanımlanırken tek tırnak kullanılır
        System.out.println("karakter yazımı = " + m + n + m + n + n + n + m);

        boolean durum; //true false durum değişkenidir;
        durum = true;
        System.out.println(durum);
        durum = false;
        System.out.println(durum);
    }

}
