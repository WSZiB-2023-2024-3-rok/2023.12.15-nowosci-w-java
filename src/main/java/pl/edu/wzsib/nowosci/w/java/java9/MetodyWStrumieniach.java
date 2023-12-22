package pl.edu.wzsib.nowosci.w.java.java9;

import java.util.List;
import java.util.Map;

public class MetodyWStrumieniach {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);

        lista.stream()
                .takeWhile(x -> x < 7)
                .dropWhile(x -> x < 4)
                .forEach(System.out::println);

        Map<Integer, String> map = Map.ofEntries(
                Map.entry(1, "V1"),
                Map.entry(2, "V2"),
                Map.entry(3, "V3"),
                Map.entry(4, "V4"),
                Map.entry(5, "V5")
        );

        map.entrySet().stream();
    }
}
