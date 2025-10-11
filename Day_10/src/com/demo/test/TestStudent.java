package com.demo.test;

import com.demo.service.StudentServiceImpl;
import com.demo.beans.Student;
import com.demo.service.StudentService;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentServiceImpl();
        int choice;

        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println(" 1. Enroll New Student");
            System.out.println(" 2. View All Student Records");
            System.out.println(" 3. Find Student by Roll No");
            System.out.println(" 4. Search by Student Name");
            System.out.println(" 5. Modify Student Percentage");
            System.out.println(" 6. Remove Record by Roll No");
            System.out.println(" 7. Bulk Delete by Percentage");
            System.out.println("\n--- Reporting & Sorting ---");
            System.out.println(" 8. Search by Percentage");
            System.out.println(" 9. Sort Records by Percentage");
            System.out.println("10. Sort Records by Name (Alphabetical)");
            System.out.println("11. Sort Records by Roll No (Numerical)");
            System.out.println("12. Exit System");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = studentService.addNewStudent();
                    System.out.println(status ? "Student enrolled successfully." : "Failed to enroll student.");
                }
                case 2 -> {
                    Set<Student> students = studentService.findAll();
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        students.forEach(System.out::println);
                    }
                }
                case 3 -> {
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    Student student = studentService.findStudentByID(rollNo);
                    System.out.println(student != null ? student : "Student not found.");
                }
                case 4 -> {
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    Set<Student> students = studentService.findStudentByName(name);
                    if (students != null && !students.isEmpty()) {
                        students.forEach(System.out::println);
                    } else {
                        System.out.println("No matching student found.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter Roll No: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter New Percentage: ");
                    double percentage = sc.nextDouble();
                    boolean status = studentService.ModifyPercentage(rollNo, percentage);
                    System.out.println(status ? "Percentage updated successfully." : "Student not found.");
                }
                case 6 -> {
                    System.out.print("Enter Roll No to delete: ");
                    int rollNo = sc.nextInt();
                    boolean status = studentService.RemoveRecordById(rollNo);
                    System.out.println(status ? "Record deleted successfully." : "Student not found.");
                }
                case 7 -> {
                    System.out.print("Enter Percentage threshold for deletion: ");
                    double percentage = sc.nextDouble();
                    boolean status = studentService.RemoveByPercentage(percentage);
                    System.out.println(status ? "Records deleted successfully." : "No matching records found.");
                }
                case 8 -> {
                    System.out.print("Enter Percentage to search: ");
                    double percentage = sc.nextDouble();
                    Set<Student> students = studentService.findStudentByPercentage(percentage);
                    if (students != null && !students.isEmpty()) {
                        students.forEach(System.out::println);
                    } else {
                        System.out.println("No students found with the given percentage.");
                    }
                }
                case 9 -> {
                    Set<Student> sortedByPercentage = studentService.sortbypercentag();
                    sortedByPercentage.forEach(System.out::println);
                }
                case 10 -> {
                    List<Student> sortedByName = studentService.sortByName();
                    sortedByName.forEach(System.out::println);
                }
                case 11 -> {
                    List<Student> sortedByRollNo = studentService.sortByRollNo();
                    sortedByRollNo.forEach(System.out::println);
                }
                case 12 -> {
                    System.out.println("Thank you for using the Student Management System!");
                    sc.close();
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 12);
    }
}
