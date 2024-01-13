package Course5.Polimorfizm;

public class Engineer extends Employee {

    private int maasKatSayisi;

    @Override
    public int calculateSalary() {
        int employeeSalary = super.calculateSalary();
        employeeSalary = employeeSalary + (employeeSalary * 30 / 100);
        return employeeSalary;
    }

}
