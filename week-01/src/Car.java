public class Car extends Vehicle{

    public Car(String name, int wheels) {
        super(name, wheels);
    }

    @Override
    public String fuelType() {
        return "Pertol";
    }

    @Override
    public void start() {
        System.out.println("Car engine is starting up!");
    }
}
