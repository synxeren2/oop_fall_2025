package hafta04;

public class encapsulation_ornek {
    public static void main(String[] args) {
        hasta_bilgileri hb = new hasta_bilgileri();
        hb.ad = "Tarık";
        hb.soyad = "Akgün";
        //hb.tc_no = "5555555550"; private atanamaz
        //hb.hasta_id = "1023"; private atanamaz



        //System.out.println(hb.tc_no); //??? yazdıramam
        System.out.println(hb.getTc_no()); //getter ile alınabilir
        System.out.println(hb.getHasta_id()); //getter ile alınabilir

        //hb.tc_no="55555555550";  yapılamaz
        hb.setTc_no("55555555550"); //setter üzerinden atanabilir
        hb.setHasta_id("1090"); //setter üzerinden değiştirilebilir
        System.out.println(hb.getTc_no()); //getter ile alınabilir
        System.out.println(hb.getHasta_id()); //getter ile alınabilir



    }
}
