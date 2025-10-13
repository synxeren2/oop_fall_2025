package hafta04;

public class erisim_niteleyiciler {
    //Global değişkenler, sınıf altına tanımlanır
    int a,b;
    //a=5; bu şekilde atamalar sadece methodlar içinde yapılabilir
    int c = 5; //başlangıç değeri atanabilir ama alt satırda atanamaz, illa ki method içinde atanmalıdır.
    // c = 23 şeklinde atanamaz!


    public void main(String[] args) {
        //Local değişkenler method içinde olur
        int a,b;
        a = 5 ;
        this.a=23; //global (üstteki a) değişkeni ise this erişim niteleyicisi le belirleriz
        System.out.println("Main method içindeki a ="+a);
        topla();
    }




    static void topla(){
        int a,b; //local değişkendir. Sadece bu method içinde kullanılabilir
        a = 109;
        System.out.println("Topla methodu içindeki a ="+a);
    }


}
