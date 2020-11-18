package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentsView {
    int n;
    final int lamo = 4;
    Scanner sc = new Scanner(System.in);
    Controller uc = new Controller();
    ArrayList<Students> studentsLíst = new ArrayList<>();

    public static void main(String[] args) {
        StudentsView views = new StudentsView();
        views.studentsview();
    }

    public void menu() {
        System.out.println("1 Add student records");
        System.out.println("2 Display student records");
        System.out.println("3 Save");
        System.out.println("4 Exit");
    }

    public void studentsview() {
        StudentsView views = new StudentsView();
        views.menu();

        n = Integer.parseInt(sc.nextLine());
        while (n != lamo) {
            switch (n) {
                case 1:
                    views.addStudents();
                    break;
                case 2:
                    views.displayStudents();
                    break;
                case 3:
                    views.saveStudents();
            }
            views.menu();
            n = sc.nextInt();
        }
        System.out.println("Stop...");
    }

    public void addStudents() {
        System.out.println("Student ID: ");
        String student_ID = sc.nextLine();

        System.out.println("Student Name: ");
        String student_Name = sc.nextLine();

        System.out.println("Student Address: ");
        String student_Address = sc.nextLine();

        System.out.println("Student Phone: ");
        String student_Phone = sc.nextLine();

        Students students = new Students(student_ID, student_Name, student_Address, student_Phone);
        studentsLíst.add(new Students(students.getStudentid(), students.getStudentname(), students.getStudentaddress(), students.getStudentphone()));
        System.out.println("Add Success");
    }

    public void displayStudents() {
        System.out.println("Students Display");
        Iterator<Students> StudentsXD =  studentsLíst.iterator();
        while (StudentsXD.hasNext()){
            Students st1 = StudentsXD.next();
            System.out.println(st1);
        }
    }

    public void saveStudents() {
        Iterator<Students> StudentsXD = studentsLíst.iterator();
        while (StudentsXD.hasNext()) {
            Students st1 = StudentsXD.next();
            uc.insertStudent(st1);
        } uc.selectStudent();
    }
}

