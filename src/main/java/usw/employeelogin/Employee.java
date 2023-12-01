package usw.employeelogin;

public class Employee {
    private final String name;
    private final int employeeNum;
    private final int employeeAge;
    private final int pinNum;

    /**
     * Creates an employee
     *
     * @param name        Name of employee
     * @param employeeNum Number employee
     * @param employeeAge Age of employee
     */
    public Employee(String name, int employeeNum, int employeeAge) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.employeeAge = employeeAge;
        this.pinNum = createPinNum();
    }

    /**
     * Internal class that returns code. Used in construction of class
     *
     * @return Returns the person's PIN
     */
    private int createPinNum() {
        // Gets the person's PIN
        // PINs are user's name length multiplied by their age
        // Modulo prevents pins above 9999
        String[] firstName = this.name.split(" ");
        return (firstName[0].length() * employeeAge) % 1000;
    }

    public String getName() {
        return name;
    }

    public int getPinNum() {
        return pinNum;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }
}
