package ClassesFundamentals.challenges.Inheritance;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Worker generic = new Worker("osvald", "12/15/1990", "12/01/2023");

//        System.out.println(generic);

        Employee employee = new Employee("osvald", "12/15/1995", "12/01/2023");

        System.out.println(employee);

        HourlyEmployee jonas = new HourlyEmployee("Jonas", "12/02/2000", "12/09/2015", 40);
        System.out.println(jonas);
        System.out.println("Jonass Paycheck = $" + jonas.collectPay());
        System.out.println("Jonas doublePaycheck = $" + jonas.getDoublePay(50));


//        System.out.println("pay for 5" + jonas.getDoublePay(5));
        jonas.terminate("12/10/2018");
//        getWorkerInfo(jonas,jonas.getDoublePay(5));
//        getWorkerInfo(jonas,  jonas.getDoublePay(45));

        SalariedEmployee salariedEmployee = new SalariedEmployee("borba", "12/02/1980", "15/05/2000",70.670);
        System.out.println(salariedEmployee);
        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();

        System.out.println("Joe's Pension check = $" + joe.collectPay());


    }
//    public static void getWorkerInfo(Worker worker) {
//        System.out.println();
//        worker.getAge();
//        worker.collectPay();
//        System.out.println( worker.collectPay());
////        worker.terminate();
//    }
}
