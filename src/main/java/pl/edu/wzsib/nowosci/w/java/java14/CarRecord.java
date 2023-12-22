package pl.edu.wzsib.nowosci.w.java.java14;

public record CarRecord(String brand, String model, int price) {
    //int a;
    public static int a = 5;

    CarRecord() {
        this("Audi", "A5", 500);
    }

    public void printBrand() {
        System.out.println(this.brand);
    }
}
