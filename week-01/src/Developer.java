public class Developer extends Employee{

    double bonus;

    Developer(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.getBaseSalary() + bonus;
    }
}
