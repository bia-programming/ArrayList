import java.util.ArrayList;
import java.util.Collections;

public class p8 {
    public static void main(String[] args) {
        ArrayList<String> obiecte=new ArrayList<>();
        obiecte.add("penar");
        obiecte.add("calculator");
        obiecte.add("calendar");
        obiecte.add("bibelou");
        obiecte.add("ventilator");
        obiecte.add("scaun");

        Collections.sort(obiecte);
        for(String i: obiecte){
            System.out.println(i);

    }
}
}

