package ClassesFundamentals.challenges.Inheritance;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker (){

    }
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public Worker (String name, String birthDate){
        this(name, birthDate ,"null");

    }
    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }
    public int getAge(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(this.birthDate, formatter);
        int currentYear = LocalDate.now().getYear();

        int birthYear = date.getYear();
        return currentYear - birthYear;
//        return Period.between(dateOfBirth, LocalDate.now()).getYears();

    }

    public int getDifferenceInMonths(String startDate, String endDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate start = LocalDate.parse(startDate, formatter);
        LocalDate end = LocalDate.parse(endDate, formatter);
        return Period.between(start, end).getMonths() + Period.between(start, end).getYears() * 12;
    }
    public void terminate(String endDate){
        this.endDate = endDate;
    }
//    public double collectPay(String hireDate, double payPerMonth){
//          int monthsWorked = getDifferenceInMonths(hireDate, this.endDate);
//          if(this.endDate == "null"){
//              System.out.println("Employee " + this.name + "is still working");
//          }
////        int hoursWorked = hireDate - this.endDate;
////        Double converted = (double) hireDate;
//        System.out.println("name = "+ this.name + " has the payment of " + df.format(payPerMonth * monthsWorked));
//        return payPerMonth * monthsWorked;
//    }
public double collectPay(){

    return 0.0;
}

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
//                " age = " + getAge() +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
