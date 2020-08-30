import java.util.*;
public class p13 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));

        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "c", "b", "d", "e"));

        Collections.sort(listOne);
        Collections.sort(listTwo);

        boolean isEqual = listOne.equals(listTwo);
        if(isEqual==true)
            System.out.println("Listele sunt egale");
        else
            System.out.println("Nu sunt egale");
    }
}
