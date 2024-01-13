package Course5.Polimorfizm;

public class Manager extends Employee {

    int maasKatsatisi = 1500;

    @Override
    public int calculateSalary() {
        int managerSalary = maasKatsatisi * getTotoalYearsWorked();
        return managerSalary;
    }

}
