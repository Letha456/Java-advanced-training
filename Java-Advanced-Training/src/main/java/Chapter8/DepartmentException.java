package Chapter8;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/

public class DepartmentException extends Exception{
    public DepartmentException(String department, String departmentID, int maxNoOfEmployees) {
        super("WRONG Department Data.  Department: " + department + ", ID: " + departmentID + ", Max Number OF Employees: " + maxNoOfEmployees);
    }
}
