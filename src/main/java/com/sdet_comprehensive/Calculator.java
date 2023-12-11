import java.util.Scanner;

public class PFCalculator {
    private double monthlyIncome;
    private int ageOfEmp;
    private double totalPF;

    public PFCalculator(double monthlyIncome, int ageOfEmp) {
        this.monthlyIncome = monthlyIncome;
        this.ageOfEmp = ageOfEmp;
    }

    public void calculatePF() {
        double employeeContribution;
        double employerContribution;

        if (ageOfEmp <= 50) {
            employeeContribution = monthlyIncome * 0.15;
            employerContribution = monthlyIncome * 0.125;
        } else if (ageOfEmp <= 60) {
            employeeContribution = monthlyIncome * 0.125;
            employerContribution = monthlyIncome * 0.1;
        } else {
            employeeContribution = monthlyIncome * 0.1;
            employerContribution = monthlyIncome * 0.075;
        }

        totalPF = employeeContribution + employerContribution;
    }

    public double getTotalPF() {
        return totalPF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly income: ");
        double monthlyIncome = scanner.nextDouble();

        System.out.println("Enter your age: ");
        int ageOfEmp = scanner.nextInt();

        PFCalculator pfCalculator = new PFCalculator(monthlyIncome, ageOfEmp);
        pfCalculator.calculatePF();

        System.out.println("Your total PF contribution is: " + pfCalculator.getTotalPF());
    }
}

