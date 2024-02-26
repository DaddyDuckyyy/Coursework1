import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private int id;
    private static int lastAssignedId = 0;

    // Constructors
    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        validation(department);
        this.salary = salary;
        lastAssignedId++;
        id = lastAssignedId;
    }

    public Employee() {
        lastAssignedId++;
        id = lastAssignedId;
    }

    // Getter and Setter
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getId(){
        return id;
    }

    // equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && fullName.equals(employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary);
    }

    // toString
    @Override
    public String toString() {
        return '\n'+"Employee{" +
                "fullName = '" + fullName+'\'' +
                ", department = " + department +
                ", salary = " + salary +
                ", id = " + id +
                '}';
    }


    private void validation(int department) {
        if ((department >= 1) && (department <= 5)) {
            this.department = department;
        } else {
            System.out.println("Номер отдела дожен быть равен числу от 1 до 5");
        }
    }
}
