
package test2;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Cap nhat sinh vien theo ID");
            System.out.println("3. Xoa sinh vien theo ID");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Tim sinh vien co GPA cao nhat");
            System.out.println("6. Hien thi sinh vien co hoc bong");
            System.out.println("7. Hien thi tong hoc phi cua tat ca sinh vien");
            System.out.println("8. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    studentList.addStudent();
                    break;
                case 2:
                    studentList.updateStudentById();
                    break;
                case 3:
                    studentList.deleteStudentById();
                    break;
                case 4:
                    studentList.displayAllStudents();
                    break;
                case 5:
                    studentList.findTopStudent();
                    break;
                case 6:
                    studentList.findScholarshipStudents();
                    break;
                case 7:
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Tong hoc phi cua tat ca sinh vien: " + totalTuition);
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
            System.out.println();
        } while (choice != 8);

        sc.close();
    }
}
