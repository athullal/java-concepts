import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        encapsulation_demo();
        polymorphism_demo();
        abstraction_demo();

    }

    private static void abstraction_demo() {
        Vehicle v1 = new Car("Skoda Kushaq",4);
        Vehicle v2 = new Bike("Ather A50",2);

        v1.start();
        System.out.println(v1.name + " is running on " + v1.fuelType());

        v2.start();
        System.out.println(v2.name + " is running on " + v2.fuelType());

    }

    private static void encapsulation_demo() {
        BankAccount myAccount = new BankAccount("ATH001", 5000);
        myAccount.displayAccountDetails();

        myAccount.deposit(1000);
        myAccount.displayAccountDetails();

        myAccount.withdraw(3000);
        myAccount.displayAccountDetails();

        myAccount.withdraw(10000);
        myAccount.displayAccountDetails();

        myAccount.deposit(-500);
        myAccount.displayAccountDetails();

        myAccount.setBalance(1000);
        myAccount.displayAccountDetails();
    }

    private static void polymorphism_demo() {
        Developer shaun = new Developer("Shaun", 50000, 7000);
        Manager glassman = new Manager("Glassman", 70000, 10000);

        Employee[] team = new Employee[2];
        team[0] = shaun;
        team[1] = glassman;

        for (Employee employee : team) {
            employee.displayInfo();
        }

        calculateSalaryExpenseOfTeam(team);
        sortEmployeesBasedOnSalary(team);
    }


    private static void sortEmployeesBasedOnSalary(Employee[] team) {

        List<Employee> team1 = new ArrayList<>();

        Collections.addAll(team1, team);

        team1.sort(Comparator.comparingDouble(Employee::calculateSalary));

        for (Employee e : team1) {
            System.out.println(e.getName() + e.getBaseSalary());
        }

    }

    public static void calculateSalaryExpenseOfTeam(Employee[] team) {
        double totalSalaryExpense = 0;
        for (Employee employee : team) {
            totalSalaryExpense = totalSalaryExpense + employee.calculateSalary();
        }
        System.out.println("Total salary expense for the team is :" + totalSalaryExpense);
    }
}