package hafta03;

public class uc_sayidan_buyugunu_bulan_method {
    public static void main(String[] args) {
        System.out.println("En küçük sayı ="+ enKucuguBul(34,43,23));
    }







    static int enKucuguBul(int a, int b, int c){
        if(a<b && a<c) return a;  // and - ve işareti
        else if(b<a && b<c) return b;
        else return c;
        //or - veya ifadesi ise java'da ||
    }



}
