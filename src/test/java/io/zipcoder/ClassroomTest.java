package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        Assert.assertEquals(expected, output, 0);
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

        Student[] students = new Student[2];
        students[0]= s1;
        students[1]= s2;
        Classroom classroom = new Classroom(students);
        classroom.addStudent(s3);

        // When

        Student[] output = classroom.getStudents();

        // Then
        assertEquals(output[2],s3);
    }

    @Test
    public void removeStudent_ShouldRemoveStudentAndReorderArray(){
        ArrayList<Double> s1Scores = new ArrayList<>();
        ArrayList<Double> s2Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s1Scores.add(150.0);
        s2Scores.add(225.0);
        s2Scores.add(25.0);

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);
        Student s3 = new Student("student", "three", s2Scores);

        Classroom classroom = new Classroom();
        classroom.addStudent(s3);
        classroom.addStudent(s2);
        classroom.addStudent(s1);

        classroom.removeStudent(s2.firstName, s2.lastName);
        Student[] students = classroom.getStudents();

        Assert.assertNull(students[2]);
        Assert.assertEquals(s1.lastName, students[1].lastName);


    }

    @Test
    public void getStudentsByScore_ShouldReturnStudentArrayByScoreInOrder() {
        ArrayList<Double> s1Scores = new ArrayList<>();
        ArrayList<Double> s2Scores = new ArrayList<>();
        ArrayList<Double> s3Scores = new ArrayList<>();
        ArrayList<Double> s4Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s2Scores.add(150.0);
        s3Scores.add(225.0);
        s4Scores.add(25.0);


        Student s1 = new Student("Jimmy", "one", s1Scores);
        Student s2 = new Student("John", "two", s2Scores);
        Student s3 = new Student("Jomes", "three", s3Scores);
        Student s4 = new Student("Julien", "four", s4Scores);
        //When
        Classroom classroom = new Classroom();
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);

        //Then
        //Student expected = classroom.getStudents()[0];
       //Student student = classroom.getStudentsByScore()[0];


        Assert.assertEquals(s1, classroom.getStudentsByScore()[0]);
    }

    @Test
    public void getGradeBook_TestToGetGradesFromStudentScores(){
       //Given
        ArrayList<Double> s1Scores = new ArrayList<>();
        ArrayList<Double> s2Scores = new ArrayList<>();
        ArrayList<Double> s3Scores = new ArrayList<>();
        ArrayList<Double> s4Scores = new ArrayList<>();
        s1Scores.add(100.0);
        s2Scores.add(150.0);
        s3Scores.add(225.0);
        s4Scores.add(25.0);


        Student s1 = new Student("Jimmy", "one", s1Scores);
        Student s2 = new Student("John", "two", s2Scores);
        Student s3 = new Student("Jones", "three", s3Scores);
        Student s4 = new Student("Julien", "four", s4Scores);
        System.out.println("here:  "+ s1.examScores.size());
        Classroom classroom = new Classroom();
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        classroom.addStudent(s4);


        //When
        Map<Student, String> student = classroom.getGradeBook();
       // System.out.println(student.get(s1));


        //Then
        //Assert.assertEquals("A", classroom.getGradeBook().get(s1));
        Assert.assertEquals(student.get(s1), classroom.getGradeBook().get(0));

    }
}
