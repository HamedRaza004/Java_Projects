abstract class Employee {
    String name;
    double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    private double bonus;

    public PermanentEmployee(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class ContractualEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractualEmployee(String name, double baseSalary, double hourlyRate, int hoursWorked) {
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee emp1 = new PermanentEmployee("Anil Kumar", 50000, 5000);
        Employee emp2 = new ContractualEmployee("Sunita Sharma", 0, 150, 160);

        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
