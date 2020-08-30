import java.util.ArrayList;
public class p21 {
    public static void main(String[] args) {
        ArrayList<String>  color = new ArrayList<String>();

        color.add("Red");
        color.add("Green");

        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);

        System.out.println("color = " + color);
    }
}
