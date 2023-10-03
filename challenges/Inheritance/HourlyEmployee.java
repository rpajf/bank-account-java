package ClassesFundamentals.challenges.Inheritance;

public class HourlyEmployee  extends Employee{

    private double hourlyPayRate;

//    public HourlyEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
//        super(name, birthDate, endDate, employeeId, hireDate);
//    }


    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay(){

        return this.hourlyPayRate * 40;
    }

    public double getDoublePay(int hours){
        System.out.println();

        if(hours > 45){
            int exccedRate = hours - 45;
            System.out.println("extra paycheck $ " + (hourlyPayRate + exccedRate) * 8);
            return collectPay() + (hourlyPayRate + exccedRate) * 8;
        }
        else {
            return collectPay();
        }
    }


}
