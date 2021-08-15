package self.study;

public class Analyst extends Employee {

    /**Attributes**/
    double salary;

    /**Constructor**/

    Analyst (String name, long IDNum, double salary) {
        super(name, IDNum, salary);
    }


    /**behavior**/

    public void annualBonus() {
        // receives annual bonus
        // at the end of the year
        // Annual bonus is 10% of Salary

        salary = this.getSalary() * 0.10;

    }


}
