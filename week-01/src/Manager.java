public class Manager extends Employee{

    double incentive;

    Manager(String name, double baseSalary, double incentive) {
        super(name, baseSalary);
        this.incentive = incentive;
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + incentive;
    }


}
