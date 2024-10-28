import java.util.Scanner;

class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    Account(String name, String accNumber, String accType) {
        customerName = name;
        accountNumber = accNumber;
        accountType = accType;
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". Updated balance: " + balance);
    }

    void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    void withdraw(double amount) {
        System.out.println("This operation is specific to account type.");
    }
}

class SavAccount extends Account {

    SavAccount(String name, String accNumber) {
        super(name, accNumber, "Savings");
    }

    void computeInterest() {
        double interest = balance * 0.03;
        System.out.println("Interest added: " + interest + ".  balance with interest: " + (balance+interest));
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
     void compoundInterest(double rate, int time) {
      // Formula for compound interest
        double ci = balance * Math.pow(1 + (rate / 365), 365 * time);
        System.out.println("Compound Interest is: " + ci + ". Updated balance: " + (balance+ci));
    }
}

class CurAccount extends Account {

    CurAccount(String name, String accNumber) {
        super(name, accNumber, "Current");
    }

    void checkMinBalance() {
        if (balance < 5000) {
            balance -= 300;
            System.out.println("Balance below minimum. Service charge imposed: 300"  + ". Updated balance: " + balance);
        }
        else{
            System.out.println("Balancen is more than minimum balance");
        }
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Updated balance: " + balance);
            checkMinBalance();
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class AccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
while(true){
System.out.println("enter 1 for savings \n enter 2 for Current ");
int accountType = sc.nextInt();
if(accountType>=3) break;
String bank = sc.nextLine();
System.out.println("Enter the name : ");
String name = sc.nextLine();
System.out.println("Enter the Accout Number : ");
String accno = sc.nextLine();
System.out.println("Enter 1 to deposite");
System.out.println("Enter 2 to withdraw");
System.out.println("Enter 3 to Display");
if(accountType==1){
System.out.println("Enter 4 for Interest");
System.out.println("Enter 5 for Compound interest");
SavAccount s = new SavAccount(name,accno);
while(true){
int pref = sc.nextInt();
if(pref==1){
System.out.println("Enter the amount ");
double amount = sc.nextDouble();
s.deposit(amount);
}
else if(pref==2){
System.out.println("Enter the amount ");
double amount = sc.nextDouble();
s.withdraw(amount);
}
else if(pref==3){
s.displayBalance();
}
else if(pref==4){
s.computeInterest();
}
else if(pref==5){
s.compoundInterest(0.05,15);
}
else break;
}
}
else if(accountType==2){
System.out.println("Enter 4 for checkMinBalance");
CurAccount s = new CurAccount(name,accno);
while(true){
int pref = sc.nextInt();
if(pref==1){
System.out.println("Enter the amount ");
double amount = sc.nextDouble();
s.deposit(amount);
}
else if(pref==2){
System.out.println("Enter the amount ");
double amount = sc.nextDouble();
s.withdraw(amount);
}
else if(pref==3){
s.displayBalance();
}
else if(pref==4){
s.checkMinBalance();
}
else break;
}
}
else break;
      }
}
}