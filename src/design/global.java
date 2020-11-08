package design;

import java.util.ArrayList;
import java.util.Scanner;

public class global {
    public static void main(String[] args) {
        ArrayList<Salary> salaries = new ArrayList<Salary>();
        Scanner sc = new Scanner(System.in);
        String op = "y";
        do {
            Salary salary = new Salary();
            System.out.println("Please Enter Salary for User "
                    + salary.getEmpId() + " :");
            salary.setSalary(sc.nextDouble());
            salary.calculateBonus();
            System.out.println(salary);
            salaries.add(salary);
            System.out.println("Do you want to enter more salaries: ");
            op = sc.next();
        } while (op.equals("y"));
        double totalSalaries = 0;
        double totalBonus = 0;
        double averageBonus = 0;
        int numberOfSalaries = 0;
        for (Salary salary : salaries) {
            System.out.println("Empid: " + salary.getEmpId() + " Salary: "
                    + salary.getSalary() + " Bonus Rate: "
                    + salary.getBonusRate() + " Bonus Amount: "
                    + salary.getBonusAmount() + " Total Salary: "
                    + salary.getTotalSalary());
            totalSalaries = totalSalaries + salary.getTotalSalary();
            totalBonus = totalBonus + salary.getBonusAmount();
            numberOfSalaries = numberOfSalaries + 1;
        }
        averageBonus = totalBonus / numberOfSalaries;
        System.out.println("Total Salaries for all employees: " + totalSalaries
                + " Total Bonuses: " + totalBonus
                + " Average Bonuses for all employees: " + averageBonus);
    }

}
