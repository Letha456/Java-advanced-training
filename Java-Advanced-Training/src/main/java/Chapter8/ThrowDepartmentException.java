package Chapter8;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/

public class ThrowDepartmentException {
    public static void main(String[] args){
        String[] testValuesForDepartment = {"IT", "QA", "CAA", "ITTT", "IDK", "KEYAZAMA"};
        String[] testValuesForDepartmentID = {"150", "99", "500", "325", "12A", "499"};
        int[] testValuesForMaxEmployees = {5,6,8,9,4,10};

        Department[] departments = new Department[testValuesForDepartment.length];

        for (int i = 0; i < testValuesForDepartment.length; i++) {
            try {
                System.out.println("Trying to create department: ");
                departments[i] = new Department(testValuesForDepartment[i],testValuesForDepartmentID[i],testValuesForMaxEmployees[i]);
                System.out.println("LEKKER : Department object created successfully with ID: " + departments[i].getDepartmentID() + ".\n");
            } catch (DepartmentException e) {
                System.out.println("HADE BOSS IT FAILED: Could not create department. YOU KNOW WHY BUT I WILL TELL YOU ANYWAYS: " + e.getMessage() + "\n");
            }
        }
    }
}
