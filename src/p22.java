import java.util.ArrayList;

public class p22 {
    public static void main(String[] args) {
        ArrayList <String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        int i;
        for(i=0;i<c1.size();i++){
            System.out.println(c1.get(i));
        }
    }
}
