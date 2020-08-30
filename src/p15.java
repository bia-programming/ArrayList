import java.util.*;

public class p15 {
    public static void main(String[] args) {
        ArrayList<String> list1=new ArrayList<>();
        list1.add("galben");
        list1.add("rosu");
        list1.add("albastru");
        list1.add("negru");

        ArrayList<String> list2=new ArrayList<>();
        list2.add("345");
        list2.add("789");
        list2.add("23");
        list2.add("866");

        list1.addAll(list2);
        System.out.println(list1);
    }
}
