package hafta03;

class Ogrenci{
    //öznitelik yada attributeları tanımlayalım
    String ad;
    String soyad;
    String tel;
    String email;
    int dt;

    void yaz(Ogrenci o){
        System.out.println("\nad = "+ o.ad +
                                    "\nSoyad = " + o.soyad +
                                    "\nTel = " + o.tel +
                                    "\nEmail= " + o.email+
                                    "\nDoğum Tarihi = " + o.dt         );
    }
}







public class sinif_class_giris {
    public static void main(String[] args) {
        Ogrenci o1 = new Ogrenci(); //öğrenci sınıfından o1 isimli nesneyi türettik
        o1.ad = "Zeynep";
        o1.soyad = "Kendirli";
        o1.email = "zk@gmail.com";
        o1.tel = "5555";
        o1.dt = 2003;
        System.out.println(o1.ad + " - " + o1.soyad);
        System.out.println(o1); //ram üzerinde o1 nesnensinin başlangıç adresini döndürür

        o1.yaz(o1);

        Ogrenci o2 = new Ogrenci();
        o2.ad = "Tarık";
        o2.soyad = "Akgün";
        o2.dt = 2005;
        System.out.println(o2.ad + " - " + o2.email);
        o2.yaz(o2);

    }

    //method
}
