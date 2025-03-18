package comparator;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(20,54,96,20,10));
        list.sort(null);
        System.out.println(list);
    }
}
