package pl.edu.wzsib.nowosci.w.java.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujaceDlaKolekcji {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        System.out.println(lista);

        List<Integer> lista2 = List.of(1,2,3,4,5);
        System.out.println(lista2);

        List<Integer> mutableList = new ArrayList<>(lista2);
        mutableList.add(10);
        System.out.println(mutableList);


        List<Integer> lista3 = List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);
        System.out.println(lista3);

        Set<Integer> set = Set.of(1,2,3,4);
        System.out.println(set);

        Map<Integer, String> map = Map.of(1, "V1", 2, "V2", 3, "V3");
        System.out.println(map);

        Map<Integer, String> map2 = Map.ofEntries(
                Map.entry(1, "V1"),
                Map.entry(2, "V2"),
                Map.entry(3, "V3"),
                Map.entry(4, "V4"),
                Map.entry(5, "V5"),
                Map.entry(6, "V6")
        );
        System.out.println(map2);
    }
}
