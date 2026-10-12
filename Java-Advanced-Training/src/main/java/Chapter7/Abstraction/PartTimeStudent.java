package Chapter7.Abstraction;

/**
 * @author : Sipho Sehlapelo
 * Project: IntelliJ IDEA
 * Date: 10/12/2026
 **/

public class PartTimeStudent extends Student{
    private double examMark;

    public double getExamMark() {
        return examMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    /**
     * Calculate Semester Mark
     *
     * @param test
     * @param assignment1
     * @param assignment2
     * @return Semester Mark
     */
    @Override
    public double calculateSemesterMark(int test, int assignment1, int assignment2) {
        return (test * 0.34) + (assignment1 * 0.33) + (assignment2 * 0.33);
    }

    /**
     * Calculate Final Mark
     *
     * @param semesterMark
     * @return Final Mark
     */
    @Override
    public double calculateFinal(double semesterMark) {
        return ((semesterMark + getExamMark())/2);
    }

    /**
     * Calculates Final Mark
     *
     * @param semesterMark
     * @param ExamMark
     * @return Final Mark
     */
    @Override
    public double calculateFinal(double semesterMark, double ExamMark) {
        return((semesterMark + ExamMark)/2);
    }
}
