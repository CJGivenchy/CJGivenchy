public class Employee {
    // Fields.
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Constructors.
    public Employee() {
    }

    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    // Methods.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Display employee information on the console.
    public String toString() {
        return String.format("Data: %s %d %s %s", name, idNumber, department, position);
    }

    public static void main(String[] args) {
        Employee first = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee second = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee third = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println("Employee #1");
        System.out.println("Name: " + first.getName());
        System.out.println("ID Number: " + first.getIdNumber());
        System.out.println("Department: " + first.getDepartment());
        System.out.println("Position: " + first.getPosition());
        System.out.println();

        System.out.println("Employee #2");
        System.out.println("Name: " + second.getName());
        System.out.println("ID Number: " + second.getIdNumber());
        System.out.println("Department: " + second.getDepartment());
        System.out.println("Position: " + second.getPosition());
        System.out.println();

        System.out.println("Employee #3");
        System.out.println("Name: " + third.getName());
        System.out.println("ID Number: " + third.getIdNumber());
        System.out.println("Department: " + third.getDepartment());
        System.out.println("Position: " + third.getPosition());
        System.out.println();
    }
}
