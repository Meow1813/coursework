public class EmployeeBook {
    private Employee[] employees;
    private static int notNullCounter = 0;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void printEmployees() { //Выводит на экран данных о сотрудниках
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            System.out.println(employees[i]);
        }
    }

    public int countAmountOfSalaries() { //Считает сумму затрат на зарплаты
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public int findMinSalaryEmployee() { //Возвращает id сотрудника с минимальной зарплатой
        int minSalary = employees[0].getSalary();
        int employeeId = employees[0].getId();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public int findMaxSalaryEmployee() { //Возвращает id сотрудника с максимальной зарплатой
        int maxSalary = employees[0].getSalary();
        int employeeId = employees[0].getId();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public int countAvgSalary() { //Возвращает среднее значение зарплаты
        return this.countAmountOfSalaries() / notNullCounter;
    }

    public void printEmployeesList() { //Выводит на экран список сотрудников
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            System.out.println(employees[i].getFullName());
        }
    }


    public void salaryIndexing(int percent) { //Индексация зп всех сотрудников
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            employees[i].setSalary((int) (employees[i].getSalary() * (1 + (percent / 100.))));
        }
    }

    public int findMaxSalaryEmployeeByDepartment(int department) { //Возвращает id сотрудника с максимальной зарплатой в отделе
        int maxSalary = 0;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() > maxSalary & employees[i].getDepartment() == department) {
                maxSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public int findMinSalaryEmployeeByDepartment(int department) { //Возвращает id сотрудника с минимальной зарплатой в отделе
        int minSalary = 100000;
        int employeeId = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < minSalary & employees[i].getDepartment() == department) {
                minSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public int countAmountOfSalariesByDepartment(int department) { //Считает сумму затрат на зарплаты по отделу
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i] != null & employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
            }
        }
        return sum;
    }

    public int countAvgSalariesByDepartment(int department) { //Считает сумму затрат на зарплаты по отделу
        int sum = 0;
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i] != null & employees[i].getDepartment() == department) {
                sum += employees[i].getSalary();
                counter++;
            }
        }
        return sum / counter;
    }

    public void salaryIndexingByDepartment(int department, int percent) { //Индексация зп по отделу
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getDepartment() == department) {
                employees[i].setSalary((int) (employees[i].getSalary() * (1 + (percent / 100.))));
            }
        }
    }

    public void printEmployeesByDepartment(int department) { //Вывод на экран данных о сотрудниках по отделу
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getDepartment() == department) {
                System.out.println("id - " + employees[i].getId() +
                        ", " + employees[i].getFullName() +
                        ", " + employees[i].getSalary());
            }
        }
    }

    public void printEmployeesWithMoreSalary(int salary) { //Вывод списка сотрудников зп которых выше указанного
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() >= salary) {
                System.out.println("id - " + employees[i].getId() +
                        ", " + employees[i].getFullName() +
                        ", " + employees[i].getSalary());
            }
        }
    }

    public void printEmployeesWithLessSalary(int salary) { //Вывод списка сотрудников зп которых ниже указанного
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getSalary() < salary) {
                System.out.println("id - " + employees[i].getId() +
                        ", " + employees[i].getFullName() +
                        ", " + employees[i].getSalary());
            }
        }
    }

    public void addEmployee(String fullName, int department, int salary) { //добавление сотрудника

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                Employee newEmployee = new Employee(fullName, department, salary);
                employees[i] = newEmployee;
                notNullCounter++;
                return;
            }
        }
        throw new ArrayIndexOutOfBoundsException("В хранилище закончилось место");

    }

    public void deleteEmployee(int id) { //удаление сотрудника
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getId() == id) {
                employees[i] = null;
                notNullCounter--;
            }
        }
    }

    public void changeSalary(String fullName, int salary) {//Изменение зарплаты
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(salary);
            }

        }
    }

    public void changeDepartment(String fullName, int department) { //Изменение отдела
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) continue;
            if (employees[i].getFullName() == fullName) {
                employees[i].setDepartment(department);
            }
        }

    }

    public void printEmployeesListByDepartment() { //Получить Ф. И. О. всех сотрудников по отделам
        for (int dep = 1; dep <= 5; dep++) {
            System.out.println("Отдел "+ dep);
            for (int i =0;i<employees.length;i++){
                if (employees[i] == null) continue;
                if(employees[i].getDepartment()==dep){
                    System.out.println(employees[i].getFullName());
                }
            }
        }
    }
}
