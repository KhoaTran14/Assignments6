package test3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    ArrayList<Person> p = new ArrayList<>();

    public PersonList() {
    }

    public ArrayList<Person> getP() {
        return p;
    }

    public void setP(ArrayList<Person> p) {
        this.p = p;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien can them: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap Thong Tin Sinh Vien " + (i + 1) + ":");
            Student student = new Student();
            student.addStudent();
            p.add(student);
        }
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong giang vien can them: ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Nhap Thong Tin Giang Vien " + (i + 1) + ":");
            Teacher teacher = new Teacher();
            teacher.addTeacher();
            p.add(teacher);
        }
    }

    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < p.size(); i++) {
            Person person = findPersonById(id);

            if (person instanceof Student) {
                Student student = (Student) person;
                student.updateStudent(id);
            } else if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                teacher.updateTeacher(id);
            }
        }
    }

    public void displayEveryone() {
        for (int i = 0; i < p.size(); i++) {
            p.get(i).displayInfo();
            System.out.println();
        }
    }

    public Person findPersonById(String id) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getId().equals(id)) {
                return p.get(i);
            }
        }
        return null;
    }
    public void deletePersonById(String id) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID sinh vien can xoa: ");
        id = sc.nextLine();
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getId().equals(id)) {
                p.remove(i);
                System.out.println("Sinh vien voi ID: " + id + " da bi xoa.");
            }
        }
    }
    public Student findTopStudent() {
        Student topStudent = null;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) instanceof Student) {
                Student student = (Student) p.get(i);
                if (student.getGPA() > topStudent.getGPA()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }
    public Teacher findTeacherByDepartment(String department) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) instanceof Teacher) {
                Teacher teacher = (Teacher) p.get(i);
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
