package io.zipcoder;
import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;// = new ArrayList<>();


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
    public Integer getNumberOfExamsTaken()  {
        return examScores.size();
    }


    public String getExamScores() {
        String result = "";
        Integer i = 1;
        for (Double d : examScores
        ) {
            result = "\tExam + "+ i +" + -> " + d + "\n";
            i++;
        }
        return result;
    }
    public void addExamScore(Double score) {
        this.examScores.add(score);
    }
    public void setExamScore(int examNumber, double newScore) {
        this.examScores.set(examNumber,newScore);
    }
    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Double score : examScores
        ) {
            sum += score;
        }
        return sum/examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " + firstName +" "+ lastName +
                "\nAverage Score: " + getAverageExamScore() + "\n " +
                getExamScores();

    }

    @Override
    public int compareTo(Student s) {
        if (this.getAverageExamScore() > s.getAverageExamScore()) {
            return 1;
        }
        else if (this.getAverageExamScore() < s.getAverageExamScore())    {
            return -1;
        }
        else {
            return 0;
        }
    }
}
