package Chapter7.inheritance;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public class EmployeeRunner {
    public static void main(String[] args){
        PermanentEmployee objPEmp = new PermanentEmployee("123456","Sipho Sehlapelo", "Sipho@net.com", 15500);
        ContractEmployee objCEmp = new ContractEmployee("987654", "Thato Real",38,250.73);
        System.out.println("==============Permanent Employee==============");
        objPEmp.display();
        System.out.println("==============Contract Employee==============");
        objCEmp.display();
    }
}
