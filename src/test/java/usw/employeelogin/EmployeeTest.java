package usw.employeelogin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {
    Employee testEmployee = new Employee("jim", 330, 20);
    Employee testEmployeeLong = new Employee("12345", 203, 4321);

    @Test
    @DisplayName("Pin number generated correctly")
    public void getPinNum() {
        assertEquals(60, testEmployee.getPinNum());
        assertEquals(605, testEmployeeLong.getPinNum());
    }
}