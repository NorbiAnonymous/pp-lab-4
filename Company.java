import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Igancy zegar", 7500, 0);
        employees[1] = new Worker("Jrek Podolski", 20001, "Engineer");
        employees[2] = new Employee("Alina Żak", 13000);
        employees[3] = new Employee("Piotr kocioł", 2000);
        employees[4] = new Worker("Madonna hyc", 12546, "Developer");

        int nonManagersCount = 0;
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                nonManagersCount++;
            }
        }

        if (employees[0] instanceof Manager) {
            ((Manager) employees[0]).setNumberOfSubordinates(nonManagersCount);
        }

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
