package Course5.Polimorfizm;

public abstract class Employee {

    private Long identityNumber;

    private String name;

    private int totoalYearsWorked;

    public int calculateSalary(){
        int salary = getTotoalYearsWorked() + 100;
        return salary;
    }

    //Getter and Setter

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotoalYearsWorked() {
        return totoalYearsWorked;
    }

    public void setTotoalYearsWorked(int totoalYearsWorked) {
        this.totoalYearsWorked = totoalYearsWorked;
    }
}
