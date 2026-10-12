package Chapter7.Abstraction;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public abstract class Student {
    /**
     * Calculate Semester Mark
     * @param test
     * @param assignment1
     * @param assignment2
     * @return
     */
    public abstract double calculateSemesterMark(int test, int assignment1, int assignment2);

    /**
     * Calculate Final Mark
     * @param semesterMark
     * @return
     */
    public abstract double calculateFinal(double semesterMark);

    /**
     * Calculate Final Mark
     * @param semesterMark
     * @param Exam
     * @return
     */
    public abstract double calculateFinal(double semesterMark, double Exam);

}
