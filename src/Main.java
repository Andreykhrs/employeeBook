public class Main {


    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {


        employees[0] = new Employee("Самолетов Василий Юрьевич", "Отдел 5", 330000);
        employees[1] = new Employee("Иванов Иван Иванович", "Отдел 1", 120000);
        employees[2] = new Employee("Петров Петр Петрович", "Отдел 2", 150000);
        employees[3] = new Employee("Сидоров Павел Петрович", "Отдел 3", 210000);
        employees[4] = new Employee("Сосискин Степан Андревич", "Отдел 4", 220000);
        employees[5] = new Employee("Тряпкина Анастасия Васильевна", "Отдел 5", 215000);
        employees[6] = new Employee("Старков Тони Макарович", "Отдел 2", 130000);
        employees[7] = new Employee("Багинова Тамара Максимовна", "Отдел 1", 140000);
        employees[8] = new Employee("Логинова Виктория Гургеновна", "Отдел 3", 194000);
        employees[9] = new Employee("Турдиев Амир Константинович", "Отдел 1", 188055);

        printToString();
        separate();
        System.out.println("Сумма затрат на ЗП в месяц - " + totalSalary() + " рублей.");
        separate();
        System.out.println("Минимальную зарплату получает " + findMinSalary());
        separate();
        System.out.println("Максимальную зарплату получает " + findMaxSalary());
        separate();
        System.out.println("Средняя зарплата " + averageSalary() + " рублей.");
        separate();
        printFullNameEmployees(employees);
        separate();
        System.out.println("Количество сотрудников " + amountOfEmployees() + " человек.");

    }


    public static void printToString() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int totalSalary() {
        int sumSalary = 0;
        for (int i = 0; i < amountOfEmployees(); i++) {
            sumSalary = employees[i].getSalary() + sumSalary;
        }
        return sumSalary;
    }

    public static Employee findMinSalary() {
        Employee minSalEmpl = employees[0];
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < amountOfEmployees(); i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                minSalEmpl = employees[i];

            }
        }
        return minSalEmpl;
    }

    public static Employee findMaxSalary() {
        Employee maxSalEmpl = employees[0];
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < amountOfEmployees(); i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                maxSalEmpl = employees[i];

            }
        }
        return maxSalEmpl;
    }

    public static int averageSalary() {
        int averageSalary = totalSalary() / employees.length;
        return averageSalary;
    }

    public static void printFullNameEmployees(Employee[] employees) {
        for (int i = 0; i < amountOfEmployees(); i++) {

            System.out.println("Id = " + employees[i].getId() + " " + employees[i].getNameEmployee());
        }
    }

    public static int amountOfEmployees() {
        int amountOfEmpl = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                amountOfEmpl++;
            }
        }
        return amountOfEmpl;
    }

    public static void separate() {
        System.out.println();
    }
}




