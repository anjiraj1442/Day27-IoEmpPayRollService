package com.brdg.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Program on Employee Pay Roll Services
 *
 * @author : Anji Raj Ardula
 * @version :16.0
 * @since : 01/110021
 */

public class EmployeePayrollService {
    public enum IOService {CONSOLE_IO, FILE_IO, DB_IO,REST_IO}
    private List<EmployeePayrollData> empPayRollList;
    public EmployeePayrollService(){}
    public EmployeePayrollService(List<EmployeePayrollData> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }
    /*
    Declaring Main Method Here
    And Calling The Methods
     */
    public static void main(String[] args){
        ArrayList<EmployeePayrollData> empPayRollList = new ArrayList<>();
        EmployeePayrollService empPayRollServices = new EmployeePayrollService(empPayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayRollServices.readEmpPayRollData(consoleInputReader);
        empPayRollServices.writeEmpPayRollData();
        System.out.println("Welcome to Java IO EmpPay Roll Programming");
    }
    /*
    Declaring the Write Employee Roll Data Method
    Printing The Details Of Employee
     */
    private void writeEmpPayRollData() {
        System.out.println("Writing Employee Data To Console :" +empPayRollList);
    }
    /*
    Declaring Read Emp PayRoll Data Method
    Reading The Details From The Scanner
    Adding The Details To List
     */
    private void readEmpPayRollData( Scanner consoleInputReader) {
        System.out.println("Enter Employee Id :");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name :");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary :");
        double salary = consoleInputReader.nextDouble();
        empPayRollList.add(new EmployeePayrollData(id,name,salary));
    }

}
