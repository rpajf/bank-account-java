package ClassesFundamentals.challenges.Inheritance;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    private static int employeeNum = 1;
//    public Employee(String name, long employeeId, String hireDate) {
//        super(name, birthDate, endDate);
//        this.employeeId = employeeId;
//        this.hireDate = hireDate;
//    }

//    public Employee(String name){
//        this(name, )
//    }
    public Employee(long employeeId, String hireDate) {
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
    public Employee (String name, String birthDate, String hireDate){
        this(name, birthDate , employeeNum, hireDate);

    }
    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNum ++;
        this.hireDate = hireDate;
    }
//    public Employee(String name, String birthDate, long employeeId, String hireDate){
//        super(name, birthDate);
//    }

    @Override
    public String toString() {
        return "This Employee of{" +
                "employeeId='" + employeeId + '\'' +
                ",was hired hireDate= '" + hireDate + '\'' +
                "} " + super.toString();
    }
}
