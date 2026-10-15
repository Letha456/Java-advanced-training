package Chapter9;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/14/2026
 **/

public class BankRunner {
    public static void main(String[] args){
        try {
            BankAccount objAcc = new BankAccount("Jessic Jones","96325887",AccountType.CHEQUE,15000);
            objAcc.deposit(20000);
            objAcc.withdraw(2000);
            System.out.println(objAcc.displaySomething());
        } catch(InsufficientFundsException | IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

    }
}
