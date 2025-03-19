package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;

public class StudentTest {

    @Test
    public void getExamsScoreTest() {
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);
        examScores.add(123.0);
        Student student = new Student(firstName, lastName, examScores);
        student.getExamScores();
        // When
        ArrayList<Double> output = (student.getExamScores());

        // Then
        Assert.assertEquals(output, student.getExamScores());
    }

    @Test
    public void addExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        ArrayList<Double> output = student.getExamScores();

        // Then
        Assert.assertEquals(output, student.getExamScores());
    }

    @Test
    public void setExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        examScores.add(100.0);
        examScores.add(95.0);
        examScores.add(123.0);


        // When
        student.setExamScore(1, 150.0);
        ArrayList<Double> output = student.getExamScores();

        // Then
        Assert.assertEquals(output, student.getExamScores());
    }

    @Test
    public void getAverageExamScoreTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);

        // When
        double expected = (125.0);
        double output = student.getAverageExamScore();

        // Then
        Assert.assertEquals(expected, output, 0.003);
    }

    @Test
    public void toStringTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<>();
        Student student = new Student(firstName, lastName, examScores);
        examScores.add(100.0);
        examScores.add(150.0);
        examScores.add(250.0);
        examScores.add(0.0);


        // When
        String output = student.toString();

        // Then
        System.out.println(output);
        //return null;
    }

}