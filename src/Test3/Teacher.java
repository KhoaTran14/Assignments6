package test3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.print("Nhap Ten: ");
        String name = sc.nextLine();
        setName(name);
        System.out.print("Nhap Phong Ban: ");
        String department = sc.nextLine();
        setDepartment(department);
        System.out.print("Nhap Mon Day: ");
        String teachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);
        System.out.print("Nhap Ngay Sinh: ");
        String dateOfBirthString = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBirthString);
            setDateOfBirth(dateOfBirth);
        } catch (Exception e) {
            System.out.println("Wrong Format!");
        }
    }

    public void updateTeacher(String id) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cap nhat thong tin sinh vien:");

        System.out.println("ID: " + id);
        displayInfo();

        System.out.print("Nhap Ten moi: ");
        String newName = sc.nextLine();
        setName(newName);

        System.out.print("Nhap Phong Ban moi: ");
        String newDepartment = sc.nextLine();
        setDepartment(department);

        System.out.print("Nhap Mon Day moi: ");
        String newTeachingSubject = sc.nextLine();
        setTeachingSubject(teachingSubject);

        System.out.print("Nhap Ngay Sinh moi: ");
        String newDOB = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDateOfBirth(sdf.parse(newDOB));
        } catch (Exception e) {
            System.out.println("Wrong Format!");
        }
        System.out.println("Cap nhat thong tin thanh cong!");
    }

    @Override
    public void displayInfo() {
        System.out.println("");
        System.out.println("Thong Tin Cua Sinh Vien: ");
        System.out.println("ID: " + this.getId());
        System.out.println("Ten: " + this.getName());
        System.out.println("Phong Ban: " + this.getDepartment());
        System.out.println("Mon Day: " + this.getTeachingSubject());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay Sinh: " + sdf.format(dateOfBirth));
    }
}
