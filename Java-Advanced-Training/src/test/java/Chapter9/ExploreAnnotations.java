package Chapter9;


import org.junit.jupiter.api.*;
/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExploreAnnotations {

    @BeforeAll
    static void setup(){
        System.err.println("Setup");
    }

    @AfterAll
    static void tearDown(){
        System.err.println("Realising all resources");
    }

    @BeforeEach
    void beforeAnyTest(){
        System.out.println("Before a test case");
    }

    @AfterEach
    void afterEachTest(){
        System.out.println("After a test case");
    }
    @Test
    @DisplayName("TC1 - First Test")
    @Order(1)
    @Tag("Sanity")
    void firstTest(){
        System.out.println("---- First Test Method");
    }

    @Test
    @DisplayName("TC2 - Second Test")
    @Order(2)
    @Tag("Integration")
    @Tag("Regression")
    void secondTest(){
        System.out.println("---- Second Test Method");
    }
    @Test
    @DisplayName("TC3 - Third Test")
    @Order(3)
    @Tag("Sanity")
    void thirdTest(){
        System.out.println("---- Third Test Method");
    }

    @Test
    @DisplayName("TC4 - Test Sum")
    @Order(4)
    @Tag("Regression")
    void testSum(){
        //Arrange - define inputs and expected results
        int num1 = 6;
        int num2 = 3;
        int expectedSum = 9;
        System.out.println("Test Sum");
    }

}