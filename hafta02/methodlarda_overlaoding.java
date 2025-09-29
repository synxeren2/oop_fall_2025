package hafta02;

public class methodlarda_overlaoding {
    public static void main(String[] args) {
        System.out.println("iki int girişli ="+ topla(5,8));
        System.out.println("Üç int girişli =" + topla(13,21,34));
        System.out.println("İki float girişli = " + topla(3.41f,4.56f));
    }

    //Java aynı isimli fakat farklı parametre girişli method tanımlamamıza imkan verir
    // Bu durum programcıya esnek ve genişletilebilir tasarım prensibi oluşturmasına olanak sağlar.





    static int topla(int a, int b){
        return a+b;
    }

    static int topla(int a,int b,int c){
        return a+b+c;
    }

    static float topla(float a, float b){
        return a+b;
    }

}
