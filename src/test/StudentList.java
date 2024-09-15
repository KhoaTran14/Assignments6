package test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {

    ArrayList<Student> students = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can them: ");
        int numOfStudents = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Nhap Thong Tin Sinh Vien " + (i + 1) + ":");
            Student student = new Student();
            student.addStudent();
            students.add(student);
        }
    }

    public void updateStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID sinh vien can cap nhat: ");
        String idToUpdate = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(idToUpdate)) {
                System.out.println("Cap nhat thong tin sinh vien:");
                Student updatedStudent = new Student();

                System.out.print("Nhap ID moi: ");
                updatedStudent.setId(sc.nextLine());

                System.out.print("Nhap Ten moi: ");
                updatedStudent.setName(sc.nextLine());

                System.out.print("Nhap Nganh moi: ");
                updatedStudent.setMajor(sc.nextLine());

                System.out.print("Nhap GPA moi: ");
                updatedStudent.setGPA(Float.parseFloat(sc.nextLine()));

                System.out.print("Nhap Ngay Sinh moi (dd/MM/yyyy): ");
                String dobStr = sc.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    updatedStudent.setDateOfBirth(sdf.parse(dobStr));
                } catch (Exception e) {
                    System.out.println("Wrong Format!");
                }

                students.set(i, updatedStudent);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ID: " + idToUpdate);
        }
    }

    public void deleteStudentById() {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        System.out.print("Nhap ID sinh vien can xoa: ");
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                students.remove(i);
                System.out.println("Sinh vien voi ID: " + id + " da bi xoa.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ID: " + id);
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
            System.out.println();
        }
    }

    public void findTopStudent() {
        Student topStudent = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            Student student = new Student();
            if (student.getGPA() > topStudent.getGPA()) {
                topStudent = student;
            }
        }

        System.out.println("Sinh vien co GPA cao nhat la:");
        topStudent.displayInfo();
    }
}
