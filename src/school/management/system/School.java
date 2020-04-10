package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teacher;
    private List<Student> student;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teacher list of teachers in the school
     * @param student list of students in the school
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
        totalMoneySpent= 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {

    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}
