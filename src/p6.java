import java.util.ArrayList;

public class p6 {
    public static void main(String[] args) {
        ArrayList<String> lista=new ArrayList<>();
        lista.add("Andrei");
        lista.add("Bianca");
        lista.add("Andreea");
        lista.add("Mihaela");
        lista.add("Alex");

        lista.remove(3);
        System.out.println("Lista: " +lista);
    }
}
