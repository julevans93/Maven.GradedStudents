package io.zipcoder;



import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    public String firstName;
    public String lastName;
    public ArrayList<Double> testScores = new ArrayList<>();

    public Student (String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        for (Double i:testScores) {
            this.testScores.add(i);
        }
     }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ArrayList<Double> getNumberOfExamsTaken(){
        return testScores;
    }
    String getExamScores(){
        for (Double index:testScores) {
            System.out.println(index);
        }

        return "";
    }
    public Double addExamScore(Double examScore){

        testScores.add(examScore);
        return null;
    }

}
