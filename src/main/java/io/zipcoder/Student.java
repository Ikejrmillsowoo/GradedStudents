package io.zipcoder;

import java.util.ArrayList;

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

    @Override
    public String toString() {
        Student student = new Student(this.firstName, this.lastName, this.examScores);
        System.out.println("Student Name: " + " " + student.firstName + " " + student.lastName);
        System.out.println("> Average Score: " + student.getAverageExamScore());
        System.out.println("> Exam Scores: " );
        for (int i = 0; i < examScores.size(); i++) {
        System.out.println("\t" +i + " -> " + examScores.get(i));
    }

        return "";
    }


    public void getNumberOfExamsTaken() {
        return;
    }

}
