package Chapter9;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/14/2026
 **/

public class DataDrivenTests {

    @ParameterizedTest
    @ValueSource(doubles = {77.5, 63.8, 66.5,57.8,78.9})
    void testExamPassScore(double examMark){
        boolean actual = examMark >= 65;


        assertTrue(actual, "PassMark should be >= [" + examMark + "]");
    }

    @ParameterizedTest
    @ValueSource(strings = {"Kate", "Jane","Carol", "Jessica", "Morgan"})
    void testNameStartsWithJ(String name){
        assertTrue(name.startsWith("J"), name + "doesn't start with J");
    }

    @ParameterizedTest
    @CsvSource(value = {"MILK,20.00,10", "BREAD,18.55,25", "CHEESE,55.35,17", "EGGS,80.55,30" })
    void testLowStockProducts(String product, double price, int qtyInStock){
        assertTrue(qtyInStock < 50, "There is enough stock for " + product);

    }

    @ParameterizedTest
    @MethodSource("Chapter9.DataStore#randomNumbers")
    void testExternalRandomNumbers(int number){
        assertTrue(number >= 45, number + "is less than 45");
    }

    static List<Integer> randomNumbers(){
        Random rnd = new Random();
        List<java.lang.Integer> numbers = new ArrayList<>();
        int count = rnd.nextInt(5, 12);//6
        for(int i = 0; i < count; i++) {
            numbers.add(rnd.nextInt(10, 70));
        }
        return numbers;
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Student Results.csv", numLinesToSkip = 1)
     void testExamMark(String module, int testMark){
        assertTrue(testMark >= 65, "You have failed " + module + " with " + testMark);
    }
}
