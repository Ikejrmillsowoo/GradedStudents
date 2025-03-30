package io.zipcoder;


import java.util.*;

public class Classroom {
    private int numberOfStudents;
    private Student[] students;

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Classroom(int numberOfStudents) {
        this.students = new Student[numberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = new Student[30];
        for (int element = 0; element < students.length; element++) {
            this.students[element] = students[element];
        }
    }

    public Student[] getStudents() {
        return this.students;
    }

    public Map<Student, String> getGradeBook(){
        Map<Student, String> graded = new HashMap<>();
        Student[] student = getStudents();

        for (int studentIndex = 0; studentIndex < getNumberOfStudents(); studentIndex++){
            //Math.max()

            if (student[studentIndex] == null) {
                return graded;
            }//check fro null
            if (student[studentIndex].examScores.get(0) > 91.0 || student[studentIndex].examScores.get(0) <= 100) {
                graded.put(student[studentIndex], "A");
            } else if (student[studentIndex].examScores.get(0) > 80 || student[studentIndex].examScores.get(0) <= 91) {
                graded.put(student[studentIndex], "B");
            } else if (student[studentIndex].examScores.get(0) > 70 || student[studentIndex].examScores.get(0) <= 80) {
                graded.put(student[studentIndex], "C");
            } else if (student[studentIndex].examScores.get(0) > 60 || student[studentIndex].examScores.get(0) <= 70) {
                graded.put(student[studentIndex], "D");
            } else if (student[studentIndex].examScores.get(0) > 50 || student[studentIndex].examScores.get(0) <= 60) {
                graded.put(student[studentIndex], "E");
            } else {
                graded.put(student[studentIndex], "F");
            }
            }
        return graded;
    }

    public double getAverageExamScore() {
        double sumOfScores = 0.0;
        double count = 0.0;
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] != null){
                count++;
                double num = this.students[i].getAverageExamScore();
                sumOfScores += num;
            }

        }
        return sumOfScores / count;
    }

    public Student[] addStudent(Student student) {
        for (int i = 0; i < this.students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                numberOfStudents++;
                break;
            }
        }
        return this.students;
    }

    public void removeStudent(String firstName, String lastName) {
        int nullStudentIndex = -1;
        for (int indexOfStudent = 0; indexOfStudent < students.length; indexOfStudent++) {
            if (this.students[indexOfStudent] != null && Objects.equals(students[indexOfStudent].firstName, firstName) && Objects.equals(students[indexOfStudent].lastName, lastName)) {
                nullStudentIndex = indexOfStudent;
                students[indexOfStudent] = null;
            }
        }
        if (nullStudentIndex >= 0) {
            for (int indexOfStudent = nullStudentIndex; indexOfStudent < students.length - 1; indexOfStudent++) {
                Student holder = students[indexOfStudent];
                students[indexOfStudent] = students[indexOfStudent + 1];
                students[indexOfStudent + 1] = holder;
            }
        }
    }

    public Student[] getStudentsByScore() {
        Student[] studentArrayByScore = new Student[students.length];
        for (int indexOfStudent = 0; indexOfStudent < students.length; indexOfStudent++) {
            double measure = 0.0;
            double count = 0.0;
            if (this.students[indexOfStudent] != null){
                if (measure < this.students[indexOfStudent].getExamScores().get(0)) {
                    measure = this.students[indexOfStudent].getExamScores().get(0);
                    studentArrayByScore[indexOfStudent] = this.students[indexOfStudent];
                } else {
                    studentArrayByScore[studentArrayByScore.length] = this.students[indexOfStudent];
                }
            }

        }
        return studentArrayByScore;

    }

    public static void main(String[] args) {
        Classroom classroom = new Classroom();
       // System.out.println(Arrays.toString(classroom.getStudents()));
    }


}
