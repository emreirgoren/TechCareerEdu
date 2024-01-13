package Course5.Polimorfizm;

public class Polimorfizm {

    public static void main(String[] args) {

       /* System.out.println("Engineer maası hesapla.");
        Engineer engineer = new Engineer();
        engineer.setTotoalYearsWorked(2);
        engineer.calculateSalary();
        int engineerSalary = engineer.calculateSalary();
        System.out.println(engineerSalary);

        System.out.println("Manager maası hesapla.");
        Manager manager = new Manager();
        manager.setTotoalYearsWorked(2);
        engineer.calculateSalary();
        int managerSalary = manager.calculateSalary();
        System.out.println(managerSalary);*/

        //Engineer engineer1 = new Engineer();

        Employee engineer = new Engineer();
        engineer.setTotoalYearsWorked(3);
        Employee manager = new Manager();
        manager.setTotoalYearsWorked(4);

        CalculateSalaryService calculateSalaryService = new CalculateSalaryService();
        calculateSalaryService.calculateSalary(engineer);
        calculateSalaryService.calculateSalary(manager);



    }

}
