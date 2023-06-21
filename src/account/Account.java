package account;

public class Account {
    private String customerName;
    private long balance;
    private long accountNumber;

    public Account(String customerName, long balance, long accountNumber) {
        this.customerName = customerName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public long getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        this.balance -= amount;
    }

}
