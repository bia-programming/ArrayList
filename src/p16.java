import java.util.ArrayList;

public class p16 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("red");
        list.add("pink");
        list.add("yellow");
        list.add("white");
        list.add("green");

        System.out.println("Original array list: " + list);
        ArrayList<String> newList = (ArrayList<String>)list.clone();
        System.out.println("Cloned array list: " + newList);
    }
}
