import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Employee.employees[0] = new Employee("1Иванов Иван Иванович", 1, 10_000);
        Employee.employees[1] = new Employee("2Иванов Иван Иванович", 2, 20_000);
        Employee.employees[2] = new Employee("3Иванов Иван Иванович", 3, 30_000);
        Employee.employees[3] = new Employee("4Иванов Иван Иванович", 4, 40_000);
        Employee.employees[4] = new Employee("5Иванов Иван Иванович", 5, 50_000);
        Employee.employees[5] = new Employee("6Иванов Иван Иванович", 1, 30_000);
        Employee.employees[6] = new Employee("7Иванов Иван Иванович", 2, 20_000);
        Employee.employees[7] = new Employee("8Иванов Иван Иванович", 3, 10_000);
        Employee.employees[8] = new Employee("9Иванов Иван Иванович", 4, 40_000);
        Employee.employees[9] = new Employee("10Иванов Иван Иванович", 5, 50_000);
        System.out.println(Arrays.toString(Employee.employees));
        Employee.employees[1].setSalary(30000);
        System.out.println("Сотруднику " + Employee.employees[1].getPerson() + " назначена зарплата " + Employee.employees[1].getSalary() + "р.");
        Employee.employees[4].setDepart(5);
        System.out.println("Сотрудник " + Employee.employees[4].getPerson() + " переведён в отдел " + Employee.employees[4].getDepart());
        System.out.println();
        Employee.getAllEmployees();
        double sumSalary = Employee.getSumSalary();
        System.out.println("Суммарная зп: " + sumSalary);
        Employee minSalaryEmployee = Employee.getMinSalary();
        System.out.println("Минимальная зп: " + minSalaryEmployee);
        Employee maxSalaryEmployee = Employee.getMaxSalary();
        System.out.println("Максимальная зп: " + maxSalaryEmployee);
        double averageSalary = Employee.getAverageSalary();
        System.out.println("Средняя зп: " + averageSalary);
        String[] employeesFullNames = Employee.getEmployeesFullNames();
        System.out.println("ФИО:");
        for (String fullName : employeesFullNames) {
            System.out.println(fullName);

        }
}
}