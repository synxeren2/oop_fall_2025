package hafta05;


abstract class Soyut{
    //nesnesi oluşturulamaz yada nesne üzerinde abstract methodlar override edilmelidir.
    //miras verebilir
    //abstract sınıfta en az bir tane abstract method olmalıdır
    abstract void tckimlikAl();
    abstract void ogrenciisimAl();

    void yaz(){
        System.out.println("Somut method içinden yazıldı");
    }
}

class Somut extends Soyut{

    @Override
    void tckimlikAl() {

    }

    @Override
    void ogrenciisimAl() {

    }

    @Override
    void yaz() {
        super.yaz(); //üst sınıftaki methodu override etmemek için başına super konur
    }
}


public class abstract_siniflar {
    public static void main(String[] args) {

        Somut smt = new Somut();
        smt.yaz(); //abstract sınıftan gelir
        smt.tckimlikAl(); //somut snıfta tanımlanan çalışır

       /*
        Soyut s = new Soyut() {
            @Override
            void tckimlikAl() {

            }

            @Override
            void ogrenciisimAl() {

            }
        }; */
    }
}
