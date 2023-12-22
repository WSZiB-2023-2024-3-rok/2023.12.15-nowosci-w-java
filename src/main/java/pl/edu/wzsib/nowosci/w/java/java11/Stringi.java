package pl.edu.wzsib.nowosci.w.java.java11;

public class Stringi {
    public static void main(String[] args) {
        String s1 = " ";
        System.out.println(s1.isBlank());

        String toRepeat = "cos";
        String repeat = toRepeat.repeat(5);
        System.out.println(repeat);

        String toStrip = " ABC ";
        System.out.println(toStrip.stripLeading());
        System.out.println(toStrip.stripTrailing());
        System.out.println(toStrip.strip());

        String stringWielolinijkowy = "A\nB\nC\nD\nE";
        System.out.println(stringWielolinijkowy);

        stringWielolinijkowy.lines()
                .map(line -> "Linia: " + line)
                .forEach(System.out::println);
    }
}
