package Chapter8;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/

public class ProductRunner {
    public static void main(String[] args) {

        try {
            Product objProduct = new Product("code123", "microwave", 500, 5);

            objProduct.increasePrice(1);
            objProduct.sell(2);
            System.out.println(objProduct);
        }catch (IllegalArgumentException | LowStockException | HighPriceIncreaseException ex){
            System.err.println(ex.getMessage());
        }

    }
}
