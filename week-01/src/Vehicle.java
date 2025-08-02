public abstract class Vehicle {
    String name;
    int wheels;

    public Vehicle(String name, int wheels){
        this.name = name;
        this.wheels = wheels;
    }

    public abstract String fuelType();

    public void start(){
        System.out.println("Starting vehicle: " + name);
    }

}
