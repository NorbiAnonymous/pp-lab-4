public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Igancy zegar", 10000);
        employees[1] = new Employee("Jrek Podolski", 20001);
        employees[2] = new Employee("Alina Żak", 13000);
        employees[3] = new Employee("Piotr kocioł", 2000);
        employees[4] = new Employee("Madonna hyc", 12546);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(54000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

