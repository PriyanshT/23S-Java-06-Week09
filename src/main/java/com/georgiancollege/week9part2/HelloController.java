package com.georgiancollege.week9part2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        Student student1 = new Student(200472123, "Tom", "Hardy");
        student1.addMarks("COMP 1011", 50);
        student1.addMarks("COMP 1012", 92);
        student1.addMarks("COMP 1013", 22);
        student1.addMarks("COMP 1013", 33);

        Student student2 = new Student(200472124, "Jerry", "Xyz");
        student2.addMarks("COMP 1011", 12);
        student2.addMarks("COMP 1012", 15);
        student2.addMarks("COMP 1013", 76);

        Student student3 = new Student(200472125, "ABC", "LastABC");
        student3.addMarks("COMP 1011", 76);
        student3.addMarks("COMP 1012", 34);
        student3.addMarks("COMP 1013", 0);

        // Array List
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(student3);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        System.out.println(studentArrayList);

        // Hash Set
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.addAll(studentArrayList);
        studentHashSet.add(student3);

        System.out.println(studentHashSet);

        // Tree Set
        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.addAll(studentArrayList);

        System.out.println(studentTreeSet);
    }
}