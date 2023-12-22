package pl.edu.wzsib.nowosci.w.java.java15;

public class SealedMain {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.a();
        child1.b();

        Child2 child2 = new Child2();
        child2.a();

        Child3 child3 = new Child3();
        child3.a();
    }
}
