package school.management.system;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent= 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeacher() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudent() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total monet earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     * @param MoneyEarned money tha is supposed to be added
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += totalMoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * update the money that is spent by the school which is the salary given by the school to its teachers.
     *
     * @param moneySpent money spent by school
     */
    public void updateTotalMoneySpent(int moneySpent) {
            totalMoneyEarned-=moneySpent;
    }
}
