package pl.edu.wzsib.nowosci.w.java.java14;

public class RecordMain {
    public static void main(String[] args) {
        CarRecord carRecord = new CarRecord("BMW", "5", 400);
        System.out.println(carRecord.brand());
        System.out.println(carRecord.model());
        System.out.println(carRecord.price());

        carRecord.printBrand();

        CarRecord carRecord2 = new CarRecord();
        System.out.println(carRecord2.brand());
        System.out.println(carRecord2.model());
        System.out.println(carRecord2.price());
    }
}
