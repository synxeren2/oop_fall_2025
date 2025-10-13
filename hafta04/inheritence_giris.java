package hafta04;

public class inheritence_giris {
    public static void main(String[] args) {
        Fakulte f = new Fakulte();
        System.out.println(f.universite_ismi); // Bunu bir üsttek universite sınıfından miras alıyoruz
        System.out.println(f.rektör); // Bir üstteki superclass'tan alırız
        System.out.println(f.dekan); //kendinden yani subclasstan gelir





        Bolum b = new Bolum();
        System.out.println(b.rektör); //dededen miras alır, üniversite sınıfından
        System.out.println(b.dekan); //babadan miras alır, fakülteden
        System.out.println(b.baskan); //kendisinden



    }
}
