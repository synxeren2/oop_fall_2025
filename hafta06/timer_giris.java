package hafta06;

import java.util.Timer;
import java.util.TimerTask;

public class timer_giris {
    static Timer t;
    static TimerTask gorev1,gorev2;
    static int sayac = 0;

    public static void main(String[] args) {
        t = new Timer();

        gorev1 = new TimerTask() {
            @Override
            public void run() {
                sayac+=5;
                System.out.println(sayac);
                if(sayac>=30) t.cancel();
            }
        };

        gorev2 = new TimerTask() {
            @Override
            public void run() {
                sayac-=3;
                System.out.println(sayac);
            }
        };

        t.schedule(gorev1,0,100);
        t.schedule(gorev2,500,500);


    }
}
