public class Main {
    public static void main(String[] args){

        BankAccount myAccount = new BankAccount("ATH001",5000);
        System.out.println(myAccount.getBalance());

        myAccount.deposit(1000);
        System.out.println(myAccount.getBalance());

        myAccount.withdraw(3000);
        System.out.println(myAccount.getBalance());

        myAccount.withdraw(10000);
        System.out.println(myAccount.getBalance());

        myAccount.deposit(-500);
        System.out.println(myAccount.getBalance());

    }
}