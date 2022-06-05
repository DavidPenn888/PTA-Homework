class BankAccount {
    public static int accountNumber;
    private int balance;
    BankAccount() {
        balance = 0;
        accountNumber++;
    }
    BankAccount(int num) {
        balance = num;
        accountNumber++;
    }
    public int getBalance() {
        return balance;
    }
    void withdraw(int amount) {
        if(amount > balance || amount < 0){
            System.out.println("Invalid Amount");
        }
        else {
            balance -= amount;
        }
    }
    void deposit(int amount) {
        if(amount < 0) {
            System.out.println("Invalid Amount");
        }
        else {
            balance += amount;
        }
    }
}

