/*5)Develop a Java program to create a class Bank that  maintains two kinds of account for its customers, one
called savings account and the other current account. The savings account provides compound interest and
withdrawal facilities but no cheque book facility. The current account provides cheque book facility but no
interest. Current account holders should also maintain a minimum balance and if the balance falls below this level,
a service charge is imposed. Create a class Account that stores customer name, account number and type of account. From this derive the classes Cur-acct and Sav-acct to make them more specific to their requirements. Include the necessary methods in order to achieve the following tasks:
a) Accept deposit from customer and update the balance.
b) Display the balance.
c) Compute and deposit interest
d) Permit withdrawal and update the balance
Check for the minimum balance, impose penalty if
necessary and update the balance*/


class Bank{
	String customer_name;
	String account_number;
	String account_type;

	Bank(String customer_name,String account_number,String account_type){
		this.customer_name = customer_name;
		this.account_number = account_number;
		this.account_type = account_type;
	}
}

class Sav_acct extends Bank{
	double Sav_amount = 0;

	Sav_acct(String customer_name,String account_number,String account_type){
		super(customer_name,account_number,account_type);
	}

	void deposit_savings(double amount){
		this.Sav_amount +=amount;
		System.out.println("the depositeed is "+amount);
	}
	
	void display_savings(){
		System.out.println("the balance is "+Sav_amount);
	}

	void deposit_interest(){
		double interest = Sav_amount*0.06;
		this.Sav_amount+=interest;
		System.out.println("the intrest is "+interest);
	}
	void withdrawal(double amount){
		this.Sav_amount -=amount;
		System.out.println("the withdrwan is "+amount);
	}
}
class Cur_acct extends Bank{

	Cur_acct(String customer_name,String account_number,String account_type){
		super(customer_name,account_number,account_type);
	}
	double Cur_amount = 0;
	void deposit_current(double amount){
		this.Cur_amount +=amount;
		System.out.println("the depositeed is "+amount);
	}
	
	void display_current(){
		System.out.println("the balance is "+Cur_amount);
	}

	void CheckMinBalance(){
		if(Cur_amount<10000){
			this.Cur_amount-=100;
			System.out.println("100 rupees has been deducted");
		}
		else{
			System.out.println("the account has more than minimum balance");
		}
	}
}

class BankWork{
	public static void main(String args[]){
		Cur_acct c = new Cur_acct("saketh","12398675","current");
		Sav_acct s = new Sav_acct("pradhan","9675855","savings");
		c.deposit_current(900);
		c.display_current();
		c.CheckMinBalance();
	}
}