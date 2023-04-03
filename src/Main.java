import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("1Иванов", "Иван", "Иванович", 1, 10_000);
        employees[1] = new Employee("2Иванов", "Иван", "Иванович", 2, 20_000);
        employees[2] = new Employee("3Иванов", "Иван", "Иванович", 3, 30_000);
        employees[3] = new Employee("4Иванов", "Иван", "Иванович", 4, 40_000);
        employees[4] = new Employee("5Иванов", "Иван", "Иванович", 5, 20_000);
        employees[5] = new Employee("6Иванов", "Иван", "Иванович", 2, 40_000);
        employees[6] = new Employee("7Иванов", "Иван", "Иванович", 3, 30_000);
        employees[7] = new Employee("8Иванов", "Иван", "Иванович", 3, 20_000);
        employees[8] = new Employee("9Иванов", "Иван", "Иванович", 4, 20_000);
        employees[9] = new Employee("10Иванов", "Иван", "Иванович", 1, 10_000);

        getAllEmployees(employees);
        System.out.println("Суммарная зп: " + getSumSalary(employees));
        System.out.println("Сотрудник с минимальной зп: " + findEmployeeMinSalary(employees));
        System.out.println("Сотрудник с максимальной зп: " + findEmployeeMaxSalary(employees));
        System.out.println("Средняя зп: " + getAverageSalary(employees));
        printEmployeesFullNames(employees);
// Базовая сложность
    }

    public static void getAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int getSumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }

    public static Employee findEmployeeMinSalary(Employee[] employees) {
        int minSalary = Integer.MAX_VALUE;
        Employee resultedEmployeeMinSalary = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                resultedEmployeeMinSalary = employee;
            }
        }
        return resultedEmployeeMinSalary;
    }

    public static Employee findEmployeeMaxSalary(Employee[] employees) {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }

    public static double getAverageSalary(Employee[] employees) {
        double sumSalary = getSumSalary(employees);
        return sumSalary / employees.length;
    }

    public static void printEmployeesFullNames(Employee[] employees) {
        String lastName = null;
        String firstName = null;
        String middleName = null;
         for (Employee employee : employees) {
              lastName = employee.getLastName();
              firstName = employee.getFirstName();
              middleName = employee.getMiddleName();

              System.out.println("ФИО: " + lastName + " " + firstName + " " + middleName);
         }
    }
    // Повышенная сложность

    }

