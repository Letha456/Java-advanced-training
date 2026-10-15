package Chapter9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/14/2026
 **/

public class BankAccountTest {

    BankAccount objAcc;

    @BeforeEach
    void setupAccount(){
        objAcc = new BankAccount("Jessica Jones", "9625887",AccountType.CHEQUE,15000);
    }
    @Test
    void testDeposit(){
        //Arrange
        double amountToDeposit = 600;
        double expectedBalance = 15600;
        //actual
        objAcc.deposit(amountToDeposit);
        double actualBalance = objAcc.getBalance();
        //Assert
        assertEquals(expectedBalance, actualBalance);

    }

    @Test
    void testInvalidDeposit(){
        assertThrows(IllegalArgumentException.class, () -> objAcc.deposit(-500));
    }

    @Test
    void testWithdraw(){
        double amountToWithdraw = 1500;
        double expectedBalance = 13500;
        //actual
        try {
            objAcc.withdraw(amountToWithdraw);
            double actualBalance = objAcc.getBalance();
            assertEquals(expectedBalance, actualBalance);
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }

    }
    @Test
    void testInvalidWithdrawalNegativeAmount(){
        assertThrows(IllegalArgumentException.class,
                () -> objAcc.withdraw(-100));
    }

    @Test
    void testWithdrawalInsufficientFunds(){
        double amountToWithdraw = objAcc.getBalance() + 1;
        assertThrows(InsufficientFundsException.class,
                () -> objAcc.withdraw(amountToWithdraw));
    }

    @AfterEach
    void getAccountDetails(){
        System.err.println(objAcc.displaySomething());
    }


    @ParameterizedTest
        @CsvSource({"DEBIT,DB-123", "SAVINGS, SV-123", "CREDIT, CT-123", "CHEQUE, CQ-123", "LOAN, LN-123", "CHEQUE, ST-123"})
        void testSetAccountNumber(AccountType accountType, String expectedAccountNumber) {
            BankAccount account = new BankAccount("Sipho Sehlapelo", "123", accountType, 1000.0);

            assertEquals(expectedAccountNumber, account.getAccountNumber());

        }


    @Test
    void testSetAccountNumberNullType() {
        BankAccount account = new BankAccount("Sipho", "123", null, 1000.0);
        assertThrows(IllegalArgumentException.class, () -> account.setAccountType(null));
    }
}
