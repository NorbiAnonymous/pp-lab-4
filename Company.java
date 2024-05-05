import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Igancy zegar", 7500, 0);
        employees[1] = new Worker("Jrek Podolski", 20001, "Engineer");
        employees[2] = new Employee("Alina Żak", 13000);
        employees[3] = new Employee("Piotr kocioł", 2000);
        employees[4] = new Worker("Madonna hyc", 12546, "Developer");
        employees[5] = new Manager("Zbyszek krzak", 0, 0);
        employees[6] = new Worker("Denzel Washington", 1200000, "Analyst");

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(employees.length - 1);
                employee.setSalary(7500);
            } else {
                double newSalary = employee.getSalary() + 500;
                employee.setSalary(newSalary);
            }
        }
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}



