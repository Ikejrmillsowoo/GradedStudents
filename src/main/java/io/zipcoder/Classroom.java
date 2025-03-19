package io.zipcoder;


public class Classroom {
    int numberOfStudents;

    Student[] student;

    public Classroom(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Classroom(Student[] student) {
        this.student = student;
    }
    public Classroom(int numberOfStudents, Student[] student) {
        this.numberOfStudents = numberOfStudents;
        this.student = student;
    }
}
