package hafta03;

public class Hacim {

    static int kutu(int en,int boy, int yuk){
        return en*boy*yuk;
    }



    float piramid(int taban, int yukseklik){
        return (float) taban*yukseklik/3;
    }

    float silindir(float pi,int r, int h){
        return (float) pi*r*r*h;
    }
}
