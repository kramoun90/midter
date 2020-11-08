package design;

public class Salary  {

    private static int count = 0;
    private int empId;
    private double salary;
    private int bonusRate;
    private double bonusAmount;
    private double totalSalary;

    //Getters and Setters
    public int getEmpId() {
        return empId;
    }
    public double getTotalSalary() {
        return totalSalary;
    }
    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getBonusRate() {
        return bonusRate;
    }
    public void setBonusRate(int bonusRate) {
        this.bonusRate = bonusRate;
    }
    public double getBonusAmount() {
        return bonusAmount;
    }
    public void setBonusAmount(double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    //Constructors
    public Salary(int empId, double salary, int bonusRate, double bonusAmount,
                  double totalSalary) {
        super();
        this.empId = empId;
        this.salary = salary;
        this.bonusRate = bonusRate;
        this.bonusAmount = bonusAmount;
        this.totalSalary = totalSalary;
    }
    public Salary() {
        super();
        count = count + 1;
        this.empId = count;
    }

    //toString
    @Override
    public String toString() {
        return "Salary [empId=" + empId + ", salary=" + salary + ", bonusRate="
                + bonusRate + ", bonusAmount=" + bonusAmount + ", totalSalary="
                + totalSalary + "]";
    }

    //calculation function
    public void calculateBonus(){
        double bonus;
        if(this.getSalary()<10000){
            this.setBonusRate(5);
            bonus = this.getSalary() + 0.05*(this.getSalary());
        }else if(this.getSalary()<20000){
            this.setBonusRate(10);
            bonus = this.getSalary() + 0.10*(this.getSalary());
        }else if(this.getSalary()<30000){
            this.setBonusRate(15);
            bonus = this.getSalary() + 0.15*(this.getSalary());
        }else{
            this.setBonusRate(20);
            bonus = this.getSalary() + 0.20*(this.getSalary());
        }
        this.setBonusAmount(bonus);
        this.setTotalSalary(this.getSalary() + bonus);
    }
}

