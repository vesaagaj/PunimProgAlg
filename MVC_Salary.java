public class MVC_Salary {
    public static void main (String [] args) {
/**Creates a view:to write employee’s details on console*/

        View_Salary v= new View_Salary();
/**fetches employee’s record based on worked hours*/
        Model_Salary m = new Model_Salary();
        Controller_Salary c= new Controller_Salary(v,m);
        c.hrs_pay();
        c.brutoPay();
        c.taxes();
        c.retirement();
        c.netoPay();
    }
}

