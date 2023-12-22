package pl.edu.wzsib.nowosci.w.java.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Copy {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);
        System.out.println(list);
        List<Integer> copyList = new ArrayList<>(list);
        System.out.println(copyList);
        List<Integer> copyList2 = List.copyOf(list);
        System.out.println(copyList2);
        //copyList2.add(5);

        var a = "ABC";
        System.out.println(a);
        a = "DEF";
        System.out.println(a);

        var x = metoda();
    }

    public static boolean metoda() {
        return true;
    }
}
