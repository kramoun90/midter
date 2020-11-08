//package design;
//
//public abstract class EmployeeABS {
//    protected String id;
//    protected String name;
//    protected double salary;
//    double payBonus;
//
//    abstract double payBonus();
//    abstract void display();
//
//    public void Employee(String i, String c, double s)//default constructor
//    {
//        id=i;
//        name=c;
//        salary=s;
//    }
//
//    public String getId()
//    {
//        return id;
//    }
//
//    public String getName()
//    {
//        return name;
//    }
//
//    public double getSalary()
//    {
//        return salary;
//    }
//}
//
//
//public class Permanent extends Employee
//{
//    public Permanent(String i, String c, double s)
//    {
//        super(i,c,s);
//
//
//    }
//
//    public double payBonus()
//    {
//        payBonus = 0.1*salary;
//        return payBonus;
//    }
//
//    public void display()
//    {
//        System.out.println("Name"  + name +"\nID" + id + "salary" + salary);
//    }
//}
//
//public class Contract extends Employee
//{   private int yearService;
//
//
//    public Contract (String i, String c, double s, int y)
//    {   super(i,c,s );
//        yearService=y;
//
//
//    }
//
//    public double payBonus()
//    {
//        payBonus = (0.15*salary)+(100*yearService);
//        return payBonus;
//    }
//
//    public void display()
//    {
//        System.out.println("Name "  + name +"\nID " + id + "\nsalary RM" + salary);
//
//
//    }
//}
//
//public class EmployeeApp
//{
//    public static void main(String args[])
//    {
//
//        Employee[] a = new Employee[100];
//        String id, name, typeEmployee, seltype;
//        double salary, bonus,max,min,payBonus;
//        char Y, Z;
//        int i,yearService,j,k,h;
//
//        Scanner s = new Scanner (System.in);
//        Scanner s1 = new Scanner (System.in);
//        Scanner s2= new Scanner (System.in);
//
//
//        for(i=0;i<a.length;i++)
//        {
//            System.out.println("Enter Name");
//            name=s.nextLine();
//            System.out.println("Enter Id ");
//            id=s.nextLine();
//            System.out.println("Enter Salary RM");
//            salary=s1.nextDouble();
//            System.out.println("C for Contract or P for Permanent");
//            typeEmployee=s.nextLine();
//            Z=typeEmployee.toUpperCase().charAt(0);
//
//            if(Z=='C')
//            {
//                System.out.println("Enter Year Service ");
//                yearService=s2.nextInt();
//
//                a[i] = new Contract(name, id, salary, yearService);
//            } else if (Z=='P') {
//                a[i] = new Permanent(name, id, salary);
//            }
//
//            System.out.println("Do you wish to continue? Y for Yes and N for NO");
//            seltype = s.nextLine();
//            Y=seltype.toUpperCase().charAt(0);
//
//            if(Y == 'N')
//            {
//                i++;
//                break;
//
//            }
//
//        }
//
//
//        bonus = 0;
//        for(j=0;j<i;j++)
//        {
//            if (a[j] instanceof Contract)
//            {
//                bonus = bonus + a[j].payBonus();
//            }
//
//            if (a[j] instanceof Permanent)
//            {
//                bonus = bonus + a[j].payBonus();
//            }
//
//        }
//
//        System.out.println("Total Bonus" + bonus);
//        bonus = 0;
//
//        for(k=0;k<i;k++)
//        {
//
//            if (a[k] instanceof Permanent)
//            {
//                bonus=bonus + a[k].payBonus();
//            }
//
//        }
//        System.out.println("Total Bonus for Permanent Employee is RM" + bonus);
//
//        double maxvalue, minvalue, tempvalue;
//        int value = 0;
//        maxvalue = tempvalue = 0;
//        minvalue = 100000;
//
//        for(h=0;h<i;h++)
//        {
//            if (a[h] instanceof Contract)
//            {
//                tempvalue = a[h].payBonus();
//                if (tempvalue > maxvalue) {
//                    maxvalue = tempvalue;
//                    value = h;
//                } else if (tempvalue < minvalue)
//                    minvalue = tempvalue;
//
//            }
//
//
//
//        }
//
//        a[value].display();
//        System.out.println ("MAXIMUM Bonus For Contract Employee is RM" + maxvalue);
//        System.out.println ("MINIMUM Bonus For Contract Employee is RM" + minvalue);
//    }
//}
