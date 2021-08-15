package self.study;

public class Employee {
    /**attributes**/

    private String name;
    private long IDNum;
    private double salary;

    /**constructor**/

    Employee (String name, long IDNum, double salary ) {

        this.name = name;
        this.IDNum = IDNum;
        this.salary = salary;
    }

    /**Access Modifiers**/

    public String getName () { return name; }
    public long getIDNum () { return IDNum; }
    public double getSalary () { return salary; }

    /**behavior**/

    public void salaryIncrease (int tenure) {
        if (tenure >= 2) {
            // 10 percent salary increase
            this.salary = (this.salary * 0.08) + this.salary;
        }
    }


    
}
