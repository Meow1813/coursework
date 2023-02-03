public class Main {

    public static void main(String[] args) {
        EmployeeBook employees = new EmployeeBook();

        employees.addEmployee("Иванов Иван Иванович", 1, 54563);
        employees.addEmployee("Иванов Иван Сергеевич", 1, 96382);
        employees.addEmployee("Петров Сергей Иванович", 2, 75329);
        employees.addEmployee("Сергеев Петр Сергеевич", 2, 97413);
        employees.addEmployee("Иванов Сергей Петрович", 3, 68256);
        employees.addEmployee("Синицин Иван Сергеевич", 3, 84357);
        employees.addEmployee("Петров Дмитрий Иванович", 4, 57321);
        employees.addEmployee("Прохоров Денис Иванович", 4, 68364);
        employees.addEmployee("Андреев Иван Дмитриевич", 5, 78563);
        employees.addEmployee("Корнеев Антон Васильевич", 5, 87465);


        employees.deleteEmployee(4);
        employees.deleteEmployee(7);
        employees.addEmployee("Петров Дмитрий Иванович", 4, 57321);
        employees.printEmployeesWithMoreSalary(34232);
        employees.printEmployees();
        employees.printEmployeesList();
        employees.countAmountOfSalaries();
        employees.changeSalary("Прохоров Денис Иванович",33213);
        employees.countAmountOfSalariesByDepartment(2);
        employees.countAvgSalary();
        employees.findMinSalaryEmployeeByDepartment(3);
        employees.salaryIndexing(10);
        employees.changeSalary("Петров Сергей Иванович",54000);
        employees.printEmployeesListByDepartment();


    }
}