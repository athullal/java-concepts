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

    }
}