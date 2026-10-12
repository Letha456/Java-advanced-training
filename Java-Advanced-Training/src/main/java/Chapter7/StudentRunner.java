package Chapter7;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public class StudentRunner {
    public static void main(String[] args){
        Student objThabo = new Student("123456","Thabo", "Smith", "thabo@net.com");
        objThabo.setAssessments(75,74,63);
        objThabo.display();


    }
}
