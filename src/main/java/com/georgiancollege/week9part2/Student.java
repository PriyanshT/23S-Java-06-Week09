package com.georgiancollege.week9part2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Student implements Comparable<Student> {
    private int studentID;
    private String firstName, lastName;
    private HashMap<String, Integer> grades;

    public Student(int studentID, String firstName, String lastName) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        grades = new HashMap<>();
    }

    public void addMarks(String courseCode, int marks){
        if(marks >= 0 && marks <= 100)
        {
            if(courseCode.matches("[A-Z]{4}\\s\\d{4}")){
                grades.put(courseCode, marks);
            } else {
                throw new IllegalArgumentException("Course code should have 4 capital letters, followed by a space," +
                        "followed by 4 digits.");
            }
        } else {
            throw new IllegalArgumentException("Marks should be in the range [0-100]");
        }
    }

    public Set<String> getCourseCode(){
        return grades.keySet();
    }

    public Collection<Integer> getMarks(){
        return grades.values();
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
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

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.studentID - otherStudent.getStudentID();
    }
}
