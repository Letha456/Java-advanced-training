package Chapter8;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/



public class LowStockException extends Exception {

    // Default constructor
    public LowStockException() {
        super("Error: Insufficient stock available for this transaction.");
    }

    // Constructor that accepts a custom error message
    public LowStockException(String message) {
        super(message);
    }
}
