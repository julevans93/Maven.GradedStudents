package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] testScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, testScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }
    @Test
    public void addExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

// When
        student.addExamScore(100.0);
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }



}