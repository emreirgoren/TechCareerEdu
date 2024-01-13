package Course5.Polimorfizm;

public class CalculateSalaryService {

    public void calculateSalary(Employee employee){
        employee.setTotoalYearsWorked(4);
        int salary = employee.calculateSalary();
        System.out.println("Employee'nin maaşı: " + salary);
    }

}
