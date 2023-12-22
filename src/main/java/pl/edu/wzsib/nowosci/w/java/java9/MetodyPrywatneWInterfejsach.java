package pl.edu.wzsib.nowosci.w.java.java9;

public interface MetodyPrywatneWInterfejsach {
    void a();

    default int diff(int a, int b) {
        print(a);
        print(b);
        return a - b;
    }

    private void print(int x) {
        //jakis algorytm
        System.out.println(x);
    }
}
