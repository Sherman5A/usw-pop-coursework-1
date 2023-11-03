package usw.employeelogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserInterface userInput = new UserInterface(scanner);
        userInput.userStart();
    }
}