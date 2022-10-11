package practice_3.Formatting._3;

import java.util.ArrayList;

public class Report {

    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        employees.add(new Employee("Petya", 12500.574));
        employees.add(new Employee("Vasya", 157.999));
        employees.add(new Employee("Masha", 14999.159));
        generateReport();
    }

    private static void generateReport() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.printf("%10s : %10.2f\n", employees.get(i).getFullname(), employees.get(i).getSalary());
        }
    }
}
