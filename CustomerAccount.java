public class CustomerAccount {

}

class Account {
    private String accNo;
    private String name;
    private String address;
    private String phone;
    public Double balance;
    private String accType;

    private String getAccNo() {
        return accNo;
    }

    public Double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Account(String accNo, String name, String address, String phone, String accType) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.accType = accType;
    }

    public void closeAccount() {
        System.out.println("Account closed");
    }

}

class SavingsAccount extends Account {
    private Double amount;

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance > 0.0 && balance > this.amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void fixedDeposit(double amount) {

    }

    public void liquidate() {

    }

    public SavingsAccount(String accNo, String name, String address, String phone, String accType) {
        super(accNo, name, address, phone, accType);
    }

    public void closeAccount() {
        System.out.println("Saings account closed");
    }
}

class LoanAccount extends Account {
    public LoanAccount(String accNo, String name, String address, String phone, String accType) {
        super(accNo, name, address, phone, accType);
        // TODO Auto-generated constructor stub
    }

    public Double loanAmt = 100000.0;

    public void payEmi(Double amount) {
        loanAmt -= amount;
    }

    public void topUpLoan(Double amount) {
        loanAmt += amount;
    }

    public void rePayment(Double amount) {
        if (loanAmt == amount) {
            loanAmt = 0.0;
        } else {
            System.out.println("Must pay full amount");
        }
    }

    public void closeAccount() {
        System.out.println("Loan account closed");
    }
}