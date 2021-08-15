package self.study;

public class Main {

    public static void main(String[] args) {
    Employee jule = new Employee("Julius", 81192, 46800.00);
    Analyst Matt = new Analyst("Emmanuel", 71383, 65000.00);
    SalesRep toya = new SalesRep("Tonya", 110771, 55000.00, 0.50);

    System.out.println(jule.getSalary());
    jule.salaryIncrease(2);
    System.out.println(jule.getSalary());

    System.out.println(toya.getName() + ": your commission earnings are: " + toya.CalcCommissions(1500.00));



    }
}
