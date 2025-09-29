package hafta02;

public class silindir_hacmi {
    public static void main(String[] args) {
        System.out.println("Hacim = "+hacim(3.14f,2.5f,5));
    }
    static float hacim(float pi,float r,int h){
        return pi*r*r*h;
    }

}
