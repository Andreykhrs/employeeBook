import java.util.Objects;

public class Employee {

    static private int count = 0;
     private int id;
    private String nameEmployee;
    private String departament;
    private int salary;

    public Employee(String nameEmployee ,String departament, int salary) {
        this.nameEmployee = nameEmployee;
        this.departament = departament;
        this.salary = salary;
        id = ++count;
    }



    public int getId() {
        return id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Сотрудник " +
                "id=" + id +
                ", " + nameEmployee +
                ", " + departament +
                ", зарплата " + salary +
                " рублей.";
    }

    public String getNameEmployee() {
        return this.nameEmployee;
    }
    public String getDepartament() {
        return this.departament;
    }
    public int getSalary() {
        return this.salary;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employee employee = (Employee) object;
        return id == employee.id && salary == employee.salary && java.util.Objects.equals(nameEmployee, employee.nameEmployee) && java.util.Objects.equals(departament, employee.departament);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, nameEmployee, departament, salary);
    }
}
