public class Employee {
    private  String lastName;
    private String firstName;
    private  String middleName;
    private int depart;
    private int salary;
    private static int counter = 0;
    private int id;

    public Employee(String lastName, String firstName, String middleName, int depart, int salary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.depart = depart;
        this.salary = salary;
        this.id = counter++;
    }
    public int getId() {
        return this.id;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
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
    @Override
    public String toString() {
        return "Сотрудик №" + getId() + " ФИО " + getLastName() + " " + getFirstName() + " " + getMiddleName() + "." + " Отдел: " + getDepart() + " Зарплата: " + getSalary();
    }
}
