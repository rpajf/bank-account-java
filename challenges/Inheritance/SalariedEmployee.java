package ClassesFundamentals.challenges.Inheritance;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
//        this.isRetired = false;
    }

    public boolean retire(){
        terminate("12/05/2020");
        return isRetired == true;
    }
    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }
}
