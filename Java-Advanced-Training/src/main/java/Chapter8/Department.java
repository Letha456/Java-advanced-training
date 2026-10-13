package Chapter8;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/13/2026
 **/

public class Department {
    private String department,departmentID;
    private int maxNoOfEmployees;

    public Department(String department, String departmentID,int maxNoOfEmployees) throws DepartmentException {
        CheckDepartment(department,departmentID,maxNoOfEmployees);
        setDepartment(department);
        setDepartmentID(departmentID);
        setMaxNoOfEmployees(maxNoOfEmployees);
    }


    public int getMaxNoOfEmployees() {
        return maxNoOfEmployees;
    }


    public void CheckDepartment(String department, String departmentID, int maxNoOfEmployees) throws DepartmentException {
        if (department == null || department.length() != 2 ||
                departmentID == null || departmentID.length() != 3 ||
                Integer.parseInt(departmentID.matches("\\d+") ? departmentID : "0") < 100 ||
                Integer.parseInt(departmentID.matches("\\d+") ? departmentID : "500") > 499 ||
                maxNoOfEmployees < 4 || maxNoOfEmployees > 10) {

            throw new DepartmentException(department, departmentID, maxNoOfEmployees);
        }
    }
    public void setMaxNoOfEmployees(int maxNoOfEmployees) throws DepartmentException {
        CheckDepartment(this.department, this.departmentID, maxNoOfEmployees);
        this.maxNoOfEmployees = maxNoOfEmployees;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) throws DepartmentException {
        CheckDepartment(department, this.departmentID, this.maxNoOfEmployees);
        this.department = department;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID)throws DepartmentException {
        CheckDepartment(this.department, departmentID, this.maxNoOfEmployees);
            this.departmentID = departmentID;
    }
}
