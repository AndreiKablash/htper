package model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String surname;
    private int mark;

    Student() {
    }

    public Student(String name, String surname, int mark) {
        this.name = name;
        this.surname = surname;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return mark == student.mark &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, mark);
    }

    @Override
    public int compareTo(Student o) {
        return this.getSurname().compareTo(o.getSurname());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mark=" + mark +
                '}';
    }
}
