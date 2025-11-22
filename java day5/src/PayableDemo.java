
interface Payable {
    void generatePayslip(); // method to be implemented
}


class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;



    Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of generatePayslip()
    public void generatePayslip() {
        double pay = hourlyRate * hoursWorked;
        System.out.println("Contractor Payslip");
        System.out.println("Name: " + name);
        System.out.println("Total Pay: Rs. " + pay);
        System.out.println("--------------------------");
    }
}


class FullTimeEmployee implements Payable {
    private String name;
    private double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Implementation of generatePayslip()
    public void generatePayslip() {
        System.out.println("Full-Time Employee Payslip");
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: Rs. " + monthlySalary);
        System.out.println("--------------------------");
    }
}

// Driver class to demonstrate polymorphism
public class PayableDemo {
    public static void main(String[] args) {
        // Interface reference for different objects
        Payable p1 = new Contractor("thiru", 500, 40);
        Payable p2 = new FullTimeEmployee("ravi", 40000);


        p1.generatePayslip();
        p2.generatePayslip();
    }
}

