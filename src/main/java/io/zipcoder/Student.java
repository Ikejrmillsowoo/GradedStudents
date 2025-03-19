package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores = new ArrayList<>();

    public Student(String firstName, String lastName, ArrayList<Double> examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        for (int i = 0; i < examScores.size(); i++) {
            System.out.println(i + "->" + examScores.get(i));
        }
        return examScores;
    }

    public void addExamScore(Double examScore){
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public double getAverageExamScore(){
       double sumOfScores = 0;
        for (int i = 0; i < examScores.size(); i++) {
            sumOfScores += examScores.get(i);
        }
        return sumOfScores/examScores.size();
    }

    public String toString(){

        System.out.println("Student name: " + " "+ );
        return "x";
    }


    public void getNumberOfExamsTaken() {
        return;
    }
}
