import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

//        BankAccount myAccount = new BankAccount("ATH001",5000);
//        myAccount.displayAccountDetails();
//
//        myAccount.deposit(1000);
//        myAccount.displayAccountDetails();
//
//        myAccount.withdraw(3000);
//        myAccount.displayAccountDetails();
//
//        myAccount.withdraw(10000);
//        myAccount.displayAccountDetails();
//
//        myAccount.deposit(-500);
//        myAccount.displayAccountDetails();
//
//        myAccount.setBalance(1000);
//        myAccount.displayAccountDetails();

        Developer shaun = new Developer("Shaun", 50000,7000);
        Manager glassman = new Manager("Glassman", 70000,10000);

        Employee[] team = new Employee[2];
        team[0] = shaun;
        team[1] = glassman;

        for(Employee employee:team){
            employee.displayInfo();
        }

        calculateSalaryExpenseOfTeam(team);
        sortEmployeesBasedOnSalary(team);

    }

    private static void sortEmployeesBasedOnSalary(Employee[] team) {

        List<Employee> team1 = new ArrayList<>();

        for (Employee e:team){
            team1.add(e);
        }

        team1.sort((e1,e2) -> Double.compare(e1.calculateSalary(), e2.calculateSalary()));

        for (Employee e:team1){
            System.out.println(e.getName() + e.getBaseSalary());
        }

    }

    public static void calculateSalaryExpenseOfTeam(Employee[] team){
        double totalSalaryExpense = 0;
        for (Employee employee:team){
            totalSalaryExpense=totalSalaryExpense+employee.calculateSalary();
        }
        System.out.println("Total salary expense for the team is :" + totalSalaryExpense);
    }
}