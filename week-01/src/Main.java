public class Main {
    public static void main(String[] args){

        BankAccount myAccount = new BankAccount("ATH001",5000);
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
}