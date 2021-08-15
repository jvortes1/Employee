package self.study;

public class SalesRep extends Employee {

    // Extends the employee class
    // sub class - child class

    /**Attributes**/
    private double commissionRate;

    /**Constructor**/

    public SalesRep (String name, int IDNum, double salary, double commissionRate) {
        super(name, IDNum, salary);
        this.commissionRate = commissionRate;
    }

    /**Access Modifiers**/
    public double getCommissionRate () {
        return commissionRate;
    }

    /**behaviors**/

    public double CalcCommissions (double sales) {
        double totalSales;
        if (sales > 0) {
            totalSales = sales * commissionRate;
        }

        else {
            totalSales = 0;

        }
        return totalSales;
    }

    public void CommissionIncrease (int tenure) {
        if (tenure >= 2) {
            // 10 percent salary increase
            this.commissionRate = (this.commissionRate * 0.10) + this.commissionRate;
        }
    }




}
