public class Employee {
    private String name;
    private double baseSalary;

    Employee(String name, double baseSalary){
    this.name = name;
    this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void displayInfo(){
        System.out.println("Employee name is : " + name);
        System.out.println("Employee base salary is : " + baseSalary);
        System.out.println("Employee salary is : " + calculateSalary());
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
