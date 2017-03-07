package salary;

/**
 * Created by Taras on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        EmployeeFixedMonthly employeeFixedMonthly = new EmployeeFixedMonthly();
        EmployeePerHour employeePerHour = new EmployeePerHour();

        System.out.println("Employee with fixed salary received " + employeeFixedMonthly.salary() + "$ per "
                + employeeFixedMonthly.getMonthNumber() + " month");
        System.out.println("Employee with salary per hour received " + employeePerHour.salary() + "$ per "
                + employeePerHour.getMonthNumber() + " month");

    }
}
