public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double initialBalance ){
        this.accountNumber = accountNumber;

        if(initialBalance<0){
            this.balance = 0;
            System.out.println("Initial balance is less than zero, setting to zero");
        }
        else {
            this.balance = initialBalance;
            System.out.println("Initial balance set");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 0)
            this.balance = balance;
        else
            System.out.println("balance can not be negative");
    }

    public void deposit(double amount){
        if(amount>0)
            balance = getBalance()+amount;
        else
            System.out.println("invalid deposit amount");
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= getBalance())
            balance = getBalance()-amount;
        else
            System.out.println("invalid or insufficient withdraw amount");
    }
}