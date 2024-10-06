public class Main {
    public static void main(String[] args) {

        Engine pertolEngine1_8 = new Engine("petrol", 1.8);
        Engine dieselEngine2_0 = new Engine("diesel", 2.0);

        Car audi = new Car("audi", "black", pertolEngine1_8, 20.5);
        Car bmw = new Car("bmw", "silver",dieselEngine2_0, 30.2);

        audi.printInfo();
        bmw.printInfo();

    }
}
