public class Main {
    public static void printEmployees(Employee[] employees) { //Выводит на экран значения массива
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int countAmountOfSalaries(Employee[] employees) { //Считает сумму затрат на зарплаты
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static int findMinSalaryEmployee(Employee[] employees) { //Возвращает id сотрудника с минимальной зарплатой
        int minSalary = employees[0].getSalary();
        int employeeId = employees[0].getId();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public static int findMaxSalaryEmployee(Employee[] employees) { //Возвращает id сотрудника с максимальной зарплатой
        int maxSalary = employees[0].getSalary();
        int employeeId = employees[0].getId();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeId = employees[i].getId();
            }
        }
        return employeeId;
    }

    public static int countAvgSalary(Employee[] employees) { //Возвращает среднее значение зарплаты
        return countAmountOfSalaries(employees) / employees.length;
    }
    public static void  printEmployeesList(Employee[] employees){ //Выводит на экран список сотрудников
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 1, 54563);
        employees[1] = new Employee("Иванов Иван Сергеевич", 1, 96382);
        employees[2] = new Employee("Петров Сергей Иванович", 2, 75329);
        employees[3] = new Employee("Сергеев Петр Сергеевич", 2, 97413);
        employees[4] = new Employee("Иванов Сергей Петрович", 3, 68256);
        employees[5] = new Employee("Синицин Иван Сергеевич", 3, 84357);
        employees[6] = new Employee("Петров Дмитрий Иванович", 4, 57321);
        employees[7] = new Employee("Прохоров Денис Иванович", 4, 68364);
        employees[8] = new Employee("Андреев Иван Дмитриевич", 5, 78563);
        employees[9] = new Employee("Корнеев Антон Васильевич", 5, 87465);


        printEmployees(employees);
        System.out.println();
        printEmployeesList(employees);
        System.out.println();
        System.out.println("Средняя зп - " + countAvgSalary(employees));
        System.out.println("Сумма затрат на зп за месяц - " + countAmountOfSalaries(employees));
        System.out.println("id сотрудника с минимальной зарплатой - "+ findMinSalaryEmployee(employees));
        System.out.println("id сотрудника с максимальной зарплатой - "+ findMaxSalaryEmployee(employees));


    }
}