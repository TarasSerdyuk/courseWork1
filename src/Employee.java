public class Employee {
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;



    public Employee (String firstName, String middleName, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }
    public static int id = 0;
    public String getFirstName() {
        return this.firstName;
    } public String getMiddleName() {
        return this.middleName;
    } public String getLastName() {
        return this.lastName;
    } public int getSalary() {
        return this.salary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
