public class Controller_Salary {
    private View_Salary v;
    private Model_Salary m;
    private int hours,payHour,extraHours;
    private double regPay,extraPayment,temporaryPay,retirementDeduction;

    public Controller_Salary(View_Salary v, Model_Salary m){
        this.v=v;
        this.m=m;
    }
    public void hrs_pay() {
        hours=v.hoursW();
        payHour=v.payPerHours();
    }
    public void brutoPay() {
        if(hours<=40){
            regPay = m.payment(payHour, hours);
        } else {
            extraHours= m.overtimeHours(hours);          extraPayment= m.extraPay(payHour, extraHours);
            regPay = m.overtimePayment(payHour, extraPayment);
        }
        v.bruto_salary(extraHours, extraPayment, regPay);
    }
    public void taxes() {
        double payrollT= m.payrollTax(regPay, hours);
        temporaryPay= m.deductionOfPayrollTax(regPay,payrollT);
        v.tax(payrollT, temporaryPay);
    }
    public void retirement() {
        retirementDeduction=m.retirementDeduction(temporaryPay);
        v.benefits(retirementDeduction);
    }
    public void netoPay(){
        double pay= m.finalyPay(temporaryPay,retirementDeduction);
        v.neto(pay);
    }
}
