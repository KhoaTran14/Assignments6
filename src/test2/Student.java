
package test2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float GPA;
    private String major;
    private double tuition = 10000000;
    private boolean schoolarship;

    public Student() {
    }
    
    public Student(float GPA, String major, double tuition, Boolean schoolarship) {
        this.GPA = GPA;
        this.major = major;
        this.tuition = tuition;
        this.schoolarship = schoolarship;
    }

    public Student(float GPA, String major, double tuition, Boolean schoolarship, String id, String name, Date dateOfBirth) {
        super(id, name, dateOfBirth);
        this.GPA = GPA;
        this.major = major;
        this.tuition = tuition;
        this.schoolarship = GPA >= 9;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
        this.schoolarship = GPA >= 9;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return schoolarship ? tuition * 0.5 : tuition;
    }

    public Boolean getSchoolarship() {
        return schoolarship;
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

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ID: ");
        String id = sc.nextLine();
        setId(id);
        System.out.print("Name: ");
        String name = sc.nextLine();
        setName(name);
        System.out.print("Major: ");
        String major = sc.nextLine();
        setMajor(major);
        System.out.print("GPA: ");
        float GPA = Float.parseFloat(sc.nextLine());
        setGPA(GPA);
        System.out.print("Date Of Birth: ");
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
    public void displayInfo() {
        System.out.println("");
        System.out.println("");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Major: " + getMajor());
        System.out.println("GPA: " + getGPA());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date Of Birth: " + sdf.format(dateOfBirth));
        System.out.println("Tuition: " + getTuition());
        System.out.println("Schoolarship: " + getSchoolarship());
    }
}
