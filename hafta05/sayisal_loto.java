package hafta05;

import java.util.ArrayList;
import java.util.Collections;

public class sayisal_loto {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        for(int i=1;i<50;i++) l.add(i);

        System.out.println(l);

        Collections.shuffle(l);
        System.out.println(l);

        ArrayList<Integer> altili = new ArrayList<>();
        for(int i=0;i<6;i++) altili.add(l.get(i));

        Collections.sort(altili);
        System.out.println(altili);


    }
}
