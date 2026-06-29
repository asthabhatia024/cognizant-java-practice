package com.mvc;

public class MVCTest {

    public static void main(String[] args) {

        Student model = new Student("Astha", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        System.out.println("\n--- Updating Data ---\n");

        controller.setStudentName("Astha Bhatia");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}