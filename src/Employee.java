public class Employee {


    private final String person;
    private int depart;
    private int salary;
    private static int counter = 0;
    private final int id;

    public Employee(String person, int depart, int salary) {
        this.person = person;
        this.depart = depart;
        this.salary = salary;
        this.id=counter++;
    }
    public int getId() {
        return this.id;
    }
    public String getPerson() {
        return this.person;
    }

    public int getDepart() {
        return this.depart;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public static Employee[] employees = new Employee[10];
    public static void getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int getSumSalary() {
        int sumSalary = 0;
        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }
        return sumSalary;
    }
    public static Employee getMinSalary() {
        Employee minSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary.getSalary()) {
                minSalary =employee;
            }
        }
        return  minSalary;
    }
    public static Employee getMaxSalary() {
        Employee maxSalary = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary.getSalary()) {
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
    public static double getAverageSalary() {
        double sumSalary = getSumSalary();
        return sumSalary / employees.length;
    }
    public static String[] getEmployeesFullNames() {
        String[] employeesFullNames = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employeesFullNames[i]=employees[i].getPerson();
        }
        return  employeesFullNames;
    }
    @Override
    public String toString() {
        return "Сотрудик №" + getId() + " ФИО " + getPerson() + "." + " Отдел " + getDepart() + " Зарплата: " + getSalary();

    }
}
