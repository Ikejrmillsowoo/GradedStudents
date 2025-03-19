package io.zipcoder;


import java.util.Arrays;

public class Classroom {
    int numberOfStudents = 30;
    Student[] students;

    public Classroom() {

    }

    public Classroom(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Classroom(Student[] students) {
        this.students = students;
    }
    public Classroom(int numberOfStudents, Student[] student) {
        this.numberOfStudents = numberOfStudents;
        this.students = student;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public double getAverageExamScore(){
        double sumOfScores = 0.0;
        for (int i = 0; i < students.length; i++) {
            double num = students[i].getAverageExamScore();
            sumOfScores += num;
        }
        return sumOfScores/students.length;
    }

    public Student[] addStudent(Student student){
        for (int i = 0; i < students.length; i++) {
            System.out.println(students.length);
            if(students[i]== null){
                students[i] = student;
            }
        }
        return students;
    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        System.out.println(Arrays.toString(classroom.getStudents()));
    }
}
