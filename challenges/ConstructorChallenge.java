package ClassesFundamentals.challenges;

public class ConstructorChallenge {

    private String name;

    private double creditLimit;

    private String email;

    public ConstructorChallenge(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public ConstructorChallenge(String name, String email) {
        this(name,1000,email);
    }
    public ConstructorChallenge() {
        // it calls the constructor that has the default 123 credit limit
        this("defaultCustomer", "empty@param.constructor");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
    public void getInfo(){
        System.out.println("info , name: "+ getName() +  " "+" credit limit " +  getCreditLimit() + " email " +getEmail());

    }
}
