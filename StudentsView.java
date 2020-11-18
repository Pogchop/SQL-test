package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentsView {
    int n;
    final int SENTINEL = 4;
    Scanner sc = new Scanner(System.in);
    Controller uc = new Controller();
    ArrayList<Students> studentsLíst = new ArrayList<>();

    public static void main(String[] args) {
        StudentsView views = new StudentsView();
        views.studentsview();
    }

    public void menu() {
        System.out.println("===================================================");
        System.out.println("1.Add student records");
        System.out.println("2.Display sutdent records");
        System.out.println("3.Save");
        System.out.println("4.Exit");
    }

    public void studentsview() {
        StudentsView views = new StudentsView();
        views.menu();

        n = Integer.parseInt(sc.nextLine());
        while (n != SENTINEL) {
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
        System.out.println("Enter Student ID: ");
        String student_ID = sc.nextLine();

        System.out.println("Enter Student Name: ");
        String student_Name = sc.nextLine();

        System.out.println("Enter Student Address: ");
        String student_Address = sc.nextLine();

        System.out.println("Enter Student Phone: ");
        String student_Phone = sc.nextLine();

        Students students = new Students(student_ID, student_Name, student_Address, student_Phone);
        studentsLíst.add(new Students(students.getStudent_ID(), students.getStudent_Name(), students.getStudent_Address(), students.getStudent_Phone()));
        System.out.println("Add Success");
    }

    public void displayStudents() {
        System.out.println("================ List Students ===============");
        Iterator<Students> StudentsIterator =  studentsLíst.iterator();
        while (StudentsIterator.hasNext()){
            Students st1 = StudentsIterator.next();
            System.out.println(st1);
        }
    }

    public void saveStudents() {
        Iterator<Students> StudentsIterator = studentsLíst.iterator();
        while (StudentsIterator.hasNext()) {
            Students st1 = StudentsIterator.next();
            uc.insertStudent(st1);
        } uc.selectStudent();
    }
}

