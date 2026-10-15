package Chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/14/2026
 **/

public class DataStore {
    public static List<Integer> randomNumbers(){
    Random rnd = new Random();
    List<Integer> numbers = new ArrayList<>();
    int count = rnd.nextInt(5, 12);//6
    for(int i = 0; i < count; i++) {
        numbers.add(rnd.nextInt(10, 70));
        }
        return numbers;
    }
}
