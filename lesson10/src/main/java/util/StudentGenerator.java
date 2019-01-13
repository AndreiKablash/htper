package util;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGenerator {
    private static final int MINIMUM_SCORE =0;
    private static final int MAXIMUM_SCORE =10;
    private List<Student> studentList;
    private Random random;//used to generate students' mark

    public StudentGenerator() {
        this.studentList = new ArrayList<>();
        this.random = new Random();
    }

    public List<Student> generate(int numberOfStudents) {
        int mark;
        for (int i = 0; i < numberOfStudents; i++) {
            mark = random.nextInt(((MAXIMUM_SCORE-MINIMUM_SCORE)+1)+MINIMUM_SCORE);
            studentList.add(new Student("Name"+i, "Surname"+i, mark));
        }
        return studentList;
    }
}
