package hafta03;

import java.math.MathContext;
import java.util.Map;

public class disardan_sinif_cagirma {
    public static void main(String[] args) {
        Hacim h = new Hacim(); //aynı pakatteki Hacim sınıfından h nesnesini türettik
        System.out.println("Kutu hacmi ="+h.kutu(3,8,2));
        System.out.println("Piramid hacmi = "+h.piramid(24,24));
        System.out.println("Silindir hacmi = "+h.silindir(3.14f,5,5));






        //Hacim sınıfında kutu methodunın basında static ifadesi var
        //bu ifade methodun nesne olmadan sınıf ismi üzerinden çağrılmasını sağlar
        //her nesne de methodun ram üzerinde aynı adrese konumlanmasını sağlar
        Hacim.kutu(3,4,5);


        //Math sınıfı içindeki attributeler static tanımlanmıştır
        System.out.println(Math.PI);
        System.out.println(Math.ceil(3.14f));
        System.out.println(Math.floor(3.14f));
        System.out.println(Math.round(3.14f));
        System.out.println(Math.round(3.51f));

    }
}
