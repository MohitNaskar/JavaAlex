public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposited " + depositAmount + " to " + customerName);
    }
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > balance) {
            System.out.println("Insufficient funds");
            System.out.println(balance);
        }
        else {
            balance -= withdrawAmount;
            System.out.println("Withdrawn " + withdrawAmount + " to " + customerName);
        }
    }
}
