package self.study;

public class Employee {
    /**attributes**/

    private String name;
    private int IDNum;
    private double salary;

    /**constructor**/

    Employee (String name, int IDNum, double salary ) {

        this.name = name;
        this.IDNum = IDNum;
        this.salary = salary;
    }

    /**Access Modifiers**/

    public String getName () { return name; }
    public int getIDNum () { return IDNum; }
    public double getSalary () { return salary; }

    /**behavior**/

    public void salaryIncrease (int tenure) {
        if (tenure >= 2) {
            // 10 percent salary increase
            this.salary = (this.salary * 0.10) + this.salary;
        }
    }


    
}
