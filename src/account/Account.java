package account;

public class Account {
    private String customerName;
    private long balance;
    private long accountNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public Account() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public Account(String customerName, long balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    public Account(String customerName, long balance, long accountNumber) {
        this.customerName = customerName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(long amount) {

    }

    public void withdraw(long amount) {

    }

    public long getBalance() {
        return balance;
    }


}
