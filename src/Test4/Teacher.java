package Test4;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
        super("", "", null);
        this.department = "";
        this.teachingSubject = "";
    }

    public Teacher(String id, String fullName, Date dateOfBirth, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth);
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

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        setId(sc.nextLine());
        System.out.print("Nhap ten: ");
        setName(sc.nextLine());
        System.out.print("Nhap bo mon: ");
        setDepartment(sc.nextLine());
        System.out.print("Nhap mon day: ");
        setTeachingSubject(sc.nextLine());
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

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cap nhat thong tin giang vien:");

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

        System.out.print("Nhap ngay sinh moi (dd/MM/yyyy): ");
        String dob = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            setDateOfBirth(sdf.parse(dob));
        } catch (Exception e) {
            System.out.println("Wrong Format!");
        }
        System.out.println("Cap nhat thong tin thanh cong!");
    }

    @Override
    public void displayInfo() {
        System.out.println("Thong Tin Cua Giang Vien: ");
        System.out.println("ID: " + this.getId());
        System.out.println("Ten: " + this.getName());
        System.out.println("Phong Ban: " + this.getDepartment());
        System.out.println("Mon Day: " + this.getTeachingSubject());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Ngay Sinh: " + sdf.format(dateOfBirth));
    }
}
