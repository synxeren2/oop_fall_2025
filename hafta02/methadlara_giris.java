package hafta02;

public class methadlara_giris {
    //----------------main method
    public static void main(String[] args) {
        yaz();
        //for(int i=0;i<10;i++) yaz(); //for döngüsünden 10 sefer çağırdık

        topla(8,13);

        int sayinin_kupu = kup(5);
        System.out.println("Main method ile yazıldı! sayının küpü ="+sayinin_kupu);

        float hesap=3*altin_oran();
        System.out.println("Main method ile yazdırıldı! Sonuç ="+hesap);


    } //------------main method sonu
    //değer almayan değer döndürmeyen methodlar
    //bir method değer döndürmüyorsa başına void eklenir
    static void yaz(){
        System.out.println("Ben değer almayan değer döndürmeyen method içinden yazıldım");
    } //yaz methodu sonu
    //değer alan değer döndürmeyen method
    static void topla(int a,int b){
        int t = a + b;
        System.out.println("Ben method içinden yazıldım! Toplam = "+t);
    }//topla methodu sonu
    //değer alan değer döndüren method
    static int kup(int a){
        return a*a*a;
    } // kup methodu sonu

    //değer almayan ama değer döndüren methodlar
    static float altin_oran(){
        return 1.6180339f;
    }

}
