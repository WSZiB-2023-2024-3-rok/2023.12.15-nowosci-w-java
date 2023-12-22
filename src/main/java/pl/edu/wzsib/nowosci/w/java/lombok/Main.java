package pl.edu.wzsib.nowosci.w.java.lombok;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car("Toyota", "Corolla", 150);

        System.out.println(car.equals(car2));

        System.out.println(car2.brand());
        System.out.println(car2.model());
        System.out.println(car2.price());

        car2.brand("Cos");

        System.out.println(car2.brand());

        Car.CarBuilder builder = new Car.CarBuilder();
        builder.brand("Audi").model("A6").price(500);

        Car car3 = builder.build();
    }
}
