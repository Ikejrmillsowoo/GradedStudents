package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClassroomTest {

    @Test
    public void getAverageExamScoreTest() {
        ArrayList<Double> s1Scores = new ArrayList<>();
        ArrayList<Double> s2Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);
        s2Scores.add(225.0);
        s2Scores.add(25.0);


        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1, s2};
        Classroom classroom = new Classroom(students);
        double expected = 125.0;

        // When
        double output = classroom.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, output, 003);
    }

    @Test
    public void addStudentTest() {
        // : Given
        ArrayList<Double> s1Scores = new ArrayList<>();
        ArrayList<Double> s2Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);
        s2Scores.add(225.0);
        s2Scores.add(25.0);

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s2Scores);

        Student[] students = {s1, s2};

        Classroom classroom = new Classroom(students);
        classroom.addStudent(s3);

        // When

        Student[] output = classroom.getStudents();

        // Then
        assertEquals(output[1],s3);
    }

//    @Test
//    public void setExamScoreTest() {
//        // : Given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        ArrayList<Double> examScores = new ArrayList<>();
//        Student student = new Student(firstName, lastName, examScores);
//        examScores.add(100.0);
//        examScores.add(95.0);
//        examScores.add(123.0);
//
//
//        // When
//        student.setExamScore(1, 150.0);
//        ArrayList<Double> output = student.getExamScores();
//
//        // Then
//        Assert.assertEquals(output, student.getExamScores());
//    }

//    @Test
//    public void getAverageExamScoreTest() {
//        // : Given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        ArrayList<Double> examScores = new ArrayList<>();
//        Student student = new Student(firstName, lastName, examScores);
//        examScores.add(100.0);
//        examScores.add(150.0);
//        examScores.add(250.0);
//        examScores.add(0.0);
//
//        // When
//        double expected = (125.0);
//        double output = student.getAverageExamScore();
//
//        // Then
//        Assert.assertEquals(expected, output, 0.003);
//    }

//    @Test
//    public void toStringTest(){
//        // : Given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        ArrayList<Double> examScores = new ArrayList<>();
//        Student student = new Student(firstName, lastName, examScores);
//        examScores.add(100.0);
//        examScores.add(150.0);
//        examScores.add(250.0);
//        examScores.add(0.0);
//
//
//        // When
//        String output = student.toString();
//
//        // Then
//        System.out.println(output);
//        //return null;
//    }
}
