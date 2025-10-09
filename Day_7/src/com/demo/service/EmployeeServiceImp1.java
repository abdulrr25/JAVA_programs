package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImp1 implements EmployeeService {
    private EmployeeDao edao;

    public EmployeeServiceImp1() {
        edao = new EmployeeDaoImpl();
    }

    @Override
    public boolean addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter ID:");
            int empid = sc.nextInt();
            System.out.println("Enter Name:");
            String nm = sc.next();
            System.out.println("Enter Salary:");
            double sal = sc.nextDouble();
            System.out.println("Enter Joining Date (dd/MM/yyyy):");
            String dt = sc.next();
            LocalDate ldt = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Employee e = new Employee(empid, nm, sal, ldt);
            return edao.save(e);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Employee> displayAll() {
        return edao.findAll();
    }

    @Override
    public Employee searchById(int eid) {
        return edao.findById(eid);
    }

    @Override
    public boolean deleteById(int eid) {
        return edao.removeById(eid);
    }

    @Override
    public List<Employee> findByName(String nm) {
        return edao.findByName(nm);
    }
}
