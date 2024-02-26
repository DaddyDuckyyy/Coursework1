import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    ///////// EASY /////////
    @Override
    public String toString() {
        return "EmployeeBook{" +
                "employees = " + Arrays.toString(employees) +
                '}' + '\n';
    }

    public double monthlyCosts() {
        double costs = 0;
        for (Employee employee : employees) {
            costs += employee.getSalary();
        }
        return costs;
    }

    public double minSalary() {
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }

    public double maxSalary() {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }

    public double averageSalary() {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return monthlyCosts() / numberOfEmployees;
    }

    public void printFullNames() {
        System.out.println("ФИО всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }


    ///////// MEDIUM /////////
    public void salaryIndexation(int percentage) {
        for (Employee employee : employees) {
            double indexation = employee.getSalary() * (1 + percentage / 100d);
            employee.setSalary(indexation);
        }
    }

    public double minSalary(int department) {
        double minSalary = maxSalary();
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                }
            }
        }
        return minSalary;
    }

    public double maxSalary(int department) {
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        return maxSalary;
    }

    public double departmentalCosts(int department) {
        double costs = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                costs += employee.getSalary();
            }
        }
        return costs;
    }

    public double averageSalaryByDepartment(int department) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        return departmentalCosts(department) / numberOfEmployees;
    }

    public void departmentSalaryIndexation(int department, int percentage) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double indexation = employee.getSalary() * (1 + percentage / 100d);
                employee.setSalary(indexation);
            }
        }
    }

    public void printDepartmentEmployee(int department) {
        System.out.println("Данные сотрудников " + department + " отдела:");
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", зарплата - " + employee.getSalary() + ", ID - " + employee.getId());
            }
        }
    }

    public void salaryComparison(int number) {
        System.out.println("Сотрудники, чья зарплата выше указанного числа: ");
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println(employee.getFullName() + ", зарплата - " + employee.getSalary() + ", ID - " + employee.getId());
            }
        }
        System.out.println('\n' + "Сотрудники, чья зарплата ниже указанного числа: ");
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println(employee.getFullName() + ", зарплата - " + employee.getSalary() + ", ID - " + employee.getId());
            }
        }
    }

    ///////// HARD /////////
    public boolean addEmployee(String fullName, int department, int salary) {
        int index = -1;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            employees[index] = new Employee(fullName, department, salary);
            return true;
        } else {
            System.out.println("База заполнена! Нельзя внести нового сотрудника: " + fullName);
            return false;
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (id == employees[i].getId()) {
                employees[i] = null;
            }
        }
    }
    public void employeeIdSearch(int id){
        for (Employee employee : employees) {
            if (id == employee.getId()) {
                System.out.println(employee);
            }
        }
    }
}
