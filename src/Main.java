public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee("Казаков Максим Дмитриевич", 1, 23785);
        employeeBook.addEmployee("Евдокимов Кирилл Викторович", 5, 98478);
        employeeBook.addEmployee("Шубина Екатерина Александровна", 3, 23344);
        employeeBook.addEmployee("Савин Даниил Кириллович", 4, 97665);
        employeeBook.addEmployee("Семенов Захар Матвеевич", 1, 9875);
        employeeBook.addEmployee("Николаева Татьяна Семёновна", 2, 29556);
        employeeBook.addEmployee("Миронов Егор Ильич", 3, 86857);
        employeeBook.addEmployee("Савельева Алия Алиевна", 4, 25576);
        employeeBook.addEmployee("Дмитриева Нина Романовна", 5, 2446);
        employeeBook.addEmployee("Дружинин Михаил Елисеевич", 4, 12267);

        System.out.println(employeeBook);
        System.out.println("Месячные расходы на зп: " + employeeBook.monthlyCosts());
        System.out.println("Минимальная зарплата: " + employeeBook.minSalary());
        System.out.println("Максимальная зарплата: " + employeeBook.maxSalary());
        System.out.println("Средняя зарплата: " + employeeBook.averageSalary() + '\n');
        employeeBook.printFullNames();


        employeeBook.salaryIndexation(10);
        System.out.println('\n' + "Минимальная зарплата в отделе: " + employeeBook.minSalary(4));
        System.out.println("Максимальная зарплата в отделе: " + employeeBook.maxSalary(4));
        System.out.println("Расходы в отделе: " + employeeBook.departmentalCosts(4));
        System.out.println("Средняя зарплата по отделу: " + employeeBook.averageSalaryByDepartment(4));
        employeeBook.departmentSalaryIndexation(4, 10);
        employeeBook.printDepartmentEmployee(4);
        employeeBook.salaryComparison(65645);


        System.out.println(employeeBook.employeeIdSearch(4));
        System.out.println(employeeBook.removeEmployee(4));
        employeeBook.addEmployee("Иванова Варвара Александровна", 1, 67543);


    }
}
