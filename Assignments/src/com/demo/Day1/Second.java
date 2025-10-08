package com.demo.Day1;
import java.util.Scanner;

public class Second {
    String nm;
    int m1, m2, m3;

    public Second(String nm, int m1, int m2, int m3) {
        this.nm = nm;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void display() {
        System.out.println("Name: " + nm);
        System.out.println("Marks1: " + m1);
        System.out.println("Marks2: " + m2);
        System.out.println("Marks3: " + m3);
        System.out.println("Total: " + (m1 + m2 + m3));
        System.out.println("-------------------------");
    }
    public double calcGpa(int m1,int m2, int m3) {
    	double gpa = (1/3)*m1+(1/2)*m2+(1/4)*m3 ;
    	return gpa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Second[] students = new Second[2];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter your name for student " + (i + 1));
            String nam = sc.next();
            System.out.println("Enter your Marks1 for student " + (i + 1));
            int m1 = sc.nextInt();
            System.out.println("Enter your Marks2 for student " + (i + 1));
            int m2 = sc.nextInt();
            System.out.println("Enter your Marks3 for student " + (i + 1));
            int m3 = sc.nextInt();

            students[i] = new Second(nam, m1, m2, m3);
        }

        System.out.println("\nStudent Details:");
        for (Second student : students) {
            student.display();
        }

        sc.close();
    }
}
