package usw.employeelogin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void userStart() {
        System.out.println("Welcome to USW employee management system");

        String employeeName;
        int employeeAge;
        int employeeNumber;


        while (true) {
            System.out.print("Please enter your full name: ");
            employeeName = scanner.nextLine();
            if (!employeeName.isEmpty()) {
                break;
            }
            System.out.println("Empty inputs are not accepted");
        }

        while (true) {
            System.out.print("What's your age: ");
            try {
                employeeAge = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Letters not allowed in age");
                scanner.nextLine();
            }
        }

        while (true) {
            System.out.print("Please enter your employee number: ");
            try {
                employeeNumber = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Letters not allowed in employee number");
                scanner.nextLine();
            }
        }

        Employee newEmployee = new Employee(employeeName, employeeNumber, employeeAge);
        System.out.printf("Hi %s. Your employee account %d has been created. Your unique pin number is %d.",
                newEmployee.getName(),
                newEmployee.getEmployeeNum(),
                newEmployee.getPinNum()
        );
    }
}
