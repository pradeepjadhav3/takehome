package Java;
/* Define a class BankAccount with methods to deposit and withdraw. Create two subclasses SavingsAccount and CheckingAccount, each with specific 
 * functionalities such as interest calculation for savings and overdraft protection for checking.*/
import java.util.*;
class BankAccount
{
	Scanner sc=new Scanner(System.in);
	int dep,wid;
	public void deposite()
	{
		System.out.println("Enter deposite amount:");
		dep=sc.nextInt();
		
	}
	public void withdraw()
	{
		System.out.println("Enter widraw amount:");
		wid=sc.nextInt();
	}
}
class SavingsAccount extends BankAccount
{
	public void interestCalc()
	{
		System.out.println("Interest is 3%");
	}
}
class CheckingAccount extends SavingsAccount
{
	public void overdraft()
	{
		System.out.println("Your remaining balence is"+(dep-wid));
	}
}
public class InheriMultiple6 {
    public static void main(String[] args) {
    	CheckingAccount obj=new CheckingAccount();
    	obj.deposite();
    	obj.withdraw();
    	obj.interestCalc();
    	obj.overdraft();
	}
}
