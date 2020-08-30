import java.io.*;
import java.util.*;
public class p11 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(46);
        list.add(345);
        list.add(65);
        list.add(20);
        list.add(24);

//        System.out.println("Lista inainte de inversare: " +list);
//        Collections.reverse(list);
//        System.out.println("Lista dupa inversare: " + list);

        int i;
        for(i=list.size()-1;i>=0;i--){
            System.out.println("list = " + list.get(i));
        }

    }
}
