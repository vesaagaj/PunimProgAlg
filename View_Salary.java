/**We should import scanner in order of us to get information from our client.*/
import java.util.Scanner;

/**This class is used to show the information that will be printed by the execution of the code.*/
public class View_Salary {
    Scanner sc = new Scanner(System.in);
    public int hoursW(){
        System.out.println("How many hours have you worked this week? ");
        int hours = sc.nextInt();
        return hours;
    }

    public int payPerHours(){
        System.out.println("How much are you paid per hour? ");
        int pay = sc.nextInt();
        return pay;
    }
    //This method is used to display the bruto salary without the deductions*/
    public void bruto_salary(int overtimeHours, double overtimePay, double regPay) {
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Extra hours worked: " + overtimeHours);
        System.out.println("The pay for the extra hours: " + overtimePay);
        System.out.println("Total gross pay: " + regPay);
        System.out.println("---------------------------------------------");
    }
    //*This method is used to display the taxes and the payment after the deduction of payroll taxes*/
    public void tax(double payrollTax, double deductionOfPayrollTax){
        System.out.println("Payroll tax: " + payrollTax);
        System.out.println("Pay after deduction of payroll tax: " + deductionOfPayrollTax);
        System.out.println("---------------------------------------------");
    }
    //*This is used  to display the retirement deduction based on using 5% of the pay*/
    public void benefits(double retirementsDeduction){
        System.out.println("Deduction of applying retirements benefits: " + retirementsDeduction);
        System.out.println("---------------------------------------------");
    }
    //*This is used to display the net which refers to a part of a whole following some sort of deduction*/
    public void neto(double pay){
        System.out.println("Your net payment: " + pay);
    }
}

