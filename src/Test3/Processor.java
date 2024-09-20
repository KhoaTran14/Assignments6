package test3;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Them giao vien");
            System.out.println("3. Cap nhat nguoi theo ID");
            System.out.println("4. Xoa nguoi theo ID");
            System.out.println("5. Tim nguoi theo ID");
            System.out.println("6. Hien thi tat ca sinh vien va giao vien");
            System.out.println("7. Tim sinh vien co GPA cao nhat");
            System.out.println("8. Tim giao vien theo bo mon");
            System.out.println("9. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    personList.addStudent();
                    break;
                case 2:
                    personList.addTeacher();
                    break;
                case 3:
                    System.out.print("Nhap ID cua nguoi can cap nhat: ");
                    String updateId = sc.nextLine();
                    personList.updatePerson(updateId);
                    break;
                case 4:
                    System.out.print("Nhap ID cua nguoi can xoa: ");
                    String deleteId = sc.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 5:
                    System.out.print("Nhap ID cua nguoi can tim: ");
                    String findId = sc.nextLine();
                    Person foundPerson = personList.findPersonById(findId);
                    foundPerson.displayInfo();
                    break;

                case 6:
                    personList.displayEveryone();
                    break;
                case 7:
                    personList.findTopStudent();
                    break;
                case 8:
                    System.out.print("Nhap ten bo mon: ");
                    String department = sc.nextLine();
                    personList.findTeacherByDepartment(department);
                    break;
                case 9:
                    System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai.");
            }
        } while (choice != 9);
    }
}
