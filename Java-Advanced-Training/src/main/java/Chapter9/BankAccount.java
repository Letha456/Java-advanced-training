package Chapter9;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/14/2026
 **/
enum AccountType{
    DEBIT,SAVINGS,CREDIT,CHEQUE,LOAN
}

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private AccountType accountType;
    private  double balance;

    public BankAccount(String accountHolder, String accountNumber, AccountType accountType, double balance) {
        setAccountHolder(accountHolder);
        setAccountType(accountType);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }



    public void setAccountNumber(String accountNumber) {
        if (getAccountType() == null) {
            throw new IllegalArgumentException("Account type cannot be null");
        }

        switch(getAccountType()) {
            case DEBIT -> this.accountNumber = "DB-" + accountNumber;
            case SAVINGS -> this.accountNumber = "SV-" + accountNumber;
            case CREDIT -> this.accountNumber = "CT-" + accountNumber;
            case CHEQUE -> this.accountNumber = "CQ-" + accountNumber;
            case LOAN -> this.accountNumber = "LN-" + accountNumber;
        }

    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException,IllegalArgumentException{
        if(amount <= 0){
            throw new IllegalArgumentException("Cannot withdraw Negative or 0 amount.");
        }
        if(amount > getBalance()){
            throw new InsufficientFundsException("Cannot withdraw more than the balance");
        }
        this.balance -= amount;

    }

    public void deposit(double amount) throws IllegalArgumentException {
        if(amount <= 0){
            throw new IllegalArgumentException("Cannot Deposit Negative or 0 amount.");
        }

        this.balance += amount;

    }

    public String displaySomething(){
        return String.format("""
                Account Holder      :   %s
                Account Number      :   %s
                Account Type        :   %s
                Balance             :   %.2f""",
                getAccountHolder(),getAccountNumber(),getAccountType(),getBalance());
    }

}
