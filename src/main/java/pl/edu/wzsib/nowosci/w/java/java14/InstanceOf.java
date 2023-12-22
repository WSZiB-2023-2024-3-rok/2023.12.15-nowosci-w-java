package pl.edu.wzsib.nowosci.w.java.java14;

public class InstanceOf {
    public static void main(String[] args) {
        Object o = "ABC";
        if(o instanceof String) {
            String s = (String) o;
            System.out.println(s.toLowerCase());
        }

        if(o instanceof String s) {
            System.out.println(s.toLowerCase());
        }
    }
}
