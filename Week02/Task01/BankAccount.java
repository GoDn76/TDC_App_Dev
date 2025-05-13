public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private int balance;

    public BankAccount(int accountNumber, String accountHolderName, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(int ammount) {
        this.balance += ammount;
    }
    public void updateName(String name){
        this.accountHolderName = name;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public int checkBalance() {
        return this.balance;
    }

    public void withdraw(int ammount) {
        if(ammount <= this.balance) {
            this.balance -= ammount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
    public void getAccountDetails() {
        System.out.println("Account Number: " + this.accountNumber + "\nAccount Holder Name: " + this.accountHolderName + "\nBalance: " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount Ajay = new BankAccount(10000001, "Ajay", 10000);
        Ajay.getAccountDetails();
        Ajay.withdraw(500);
        System.out.println(Ajay.checkBalance());
        Ajay.deposit(500);
        System.out.println(Ajay.checkBalance());
        Ajay.updateName("Ajay Singh");
        Ajay.getAccountDetails();
    }
}
