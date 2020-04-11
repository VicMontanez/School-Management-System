package school.management.system;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhorn);

        Student tanasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith V", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        School ghs = new School()
    }
}
