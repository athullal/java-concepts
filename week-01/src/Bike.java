public class Bike extends Vehicle{

    public Bike(String name, int wheels) {
        super(name, wheels);
    }

    @Override
    public String fuelType() {
        return "electric";
    }

    @Override
    public void start() {
        System.out.println("Bike motor is charging up!");
    }
}
