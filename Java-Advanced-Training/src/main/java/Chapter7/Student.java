package Chapter7;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public class Student {
    private String studentNum;
    private String firstName;
    private String lastName;
    private String email;
    private int testMark, assignment1, assignment2;

    /**
     * Default Constructor
     */
    public Student() {
        studentNum = "000000";
        firstName = "No name";
        lastName = "No lastname";
        email = "none";
        testMark = 0;
        assignment1 = 0;
        assignment2 = 0;

    }

    /**
     * Construct an objecy of Student with their attributes
     * @param studentNum
     * @param firstName
     * @param lastName
     * @param email
     */
    public Student(String studentNum, String firstName, String lastName, String email) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    /**
     * Setter Function to set a Students student Number
     * @param stNum
     */
    private void setStudentNum(String stNum) {
        this.studentNum = "ST-26" + stNum;
    }

    /**
     * Setter Function to set a Students First Name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Setter Function to set a Students Last Name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Setter Function to set a Students email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Setter Function to set a Students Test Mark, assignment 1 mark and assignment 2 mark
     * @param test
     * @param assignment1
     * @param assignment2
     */
    public void setAssessments(int test, int assignment1, int assignment2){
        this.testMark = test;
        this.assignment1 = assignment1;
        this.assignment2 = assignment2;
    }
    /**
     * Getter Function for getting the value of a Students studentNumber
     * @return String studentNum of a Student
     */
    public String getStudentNum(){
        return studentNum;
    }
    /**
     * Getter Function for getting the value of a Students full Name
     * @return String full name of a Student
     */
    public String getName(){
        return firstName + " " + lastName;
    }
    /**
     * Getter Function for getting the value of a Students email
     * @return String email of a Student
     */
    public String getEmail(){
        return email;
    }
    /**
     * Getter Function for getting the value of a Students First Name
     * @return String FirstName of a Student
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Getter Function for getting the value of a Students Last Name
     * @return String LastName of a Student
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Getter Function for getting the value of a Students Assignment 1
     * @return int Assignment 1 of a Student
     */
    public int getAssignment1() {
        return assignment1;
    }

    /**
     * Getter Function for getting the value of a Students Assignment 2
     * @return int Assignment 2 of a Student
     */
    public int getAssignment2() {
        return assignment2;
    }

    /**
     * Getter Function for getting the value of a Students TestMark
     * @return int TestMark of a Student
     */
    public int getTestMark() {
        return testMark;
    }
    /**
     * Getter Function for getting the value of a Students SemesterMark
     * @return double SemesterMark of a Student
     */
    public double getSemeseterMark(){
        return ((this.testMark * 0.4) + (this.assignment1 * 0.35) + (this.assignment2 * 0.25));
    }

    /**
     * Function to display a Students StudentNumber,Full Name,Email and their Semester Mark
     */
    public void display(){
        System.out.println("Student#: " + getStudentNum());
        System.out.println("Name#: " + getName());
        System.out.println("Email#: " + getEmail());
        System.out.println("Semester Mark#: " + getSemeseterMark());

    }
}
