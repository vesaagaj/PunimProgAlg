/**This class is used to display the payment by multiplying the value of pay for hours and hours*/
public class Model_Salary {
    public double payment(double pay, int hrs){
        return (pay*hrs);
    }
    /**This method shows the result of extra hours*/
    public int overtimeHours(int hrs){
        int extraHrs = hrs - 40;
        return extraHrs;
    }
    /**This method shows the result of extra payment*/
    public double extraPay(double pay, int extraHrs){
        double extraPayment = extraHrs*(1.5*pay);
        return extraPayment;
    }
    /**This method displays the value of over time payment*/
    public double overtimePayment(double pay, double extraPayment){
        double overtimeP=((40*pay)+(extraPayment));
        return overtimeP;
    }
    /**Payroll tax is used to show the payroll tax value based on the percentage*/
    public double payrollTax(double payment, int hrs){
        int percentage = 0;
        if(hrs<=30){
            percentage = 20;
        }
        else if (hrs>30 && hrs<=40){
            percentage = 25;
        }
        else {
            percentage = 28;
        }
        return ((payment*percentage)/100.0);
    }
    /**This method shows the deduction of payroll tax*/
    public double deductionOfPayrollTax(double regPay, double payrollTax) {
        double temporaryPay= regPay - payrollTax;
        return temporaryPay;
    }
    /**This method displays the value of retirement deducion*/
    public double retirementDeduction(double payment){
        double deducion=(payment*5.0)/100.0;
        return deducion;
    }
    /**This method shows the result of the final pay*/
    public double finalyPay(double pay, double deducion){
        double neto= pay - deducion;
        return neto;
    }
}
