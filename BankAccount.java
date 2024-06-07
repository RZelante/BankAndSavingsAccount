

/**This abstract class creates a bank account object
 *
 * @author Ricardo Zelante
 */
public abstract class BankAccount {
    
    private double balance;
    private int depositsThisMonth;
    private int withdrawals;
    protected double MonthlyServiceCharge;
    private double AnnualInterestRate;
    
    public BankAccount(double b, double i){
        this.balance = b;
        this.AnnualInterestRate = i;
    }
    
    public void deposit(double d){
        this.balance += d;
        this.depositsThisMonth++;
        
    }
    
    public void withdraw(double w){
        this.balance -= w;
        this.withdrawals++;

    }
    
    public void calcInterest(){
        double Monthly_Interest_Rate = (AnnualInterestRate / 12);
        double Monthly_Interest = this.balance * Monthly_Interest_Rate;
        this.balance += Monthly_Interest;

    }
    
    public void monthlyProcess(){
        this.balance -= MonthlyServiceCharge;
        calcInterest();
        this.withdrawals = 0;
        this.depositsThisMonth = 0;
        this.MonthlyServiceCharge = 0;

    }
    ////////////////////////////////////////Set() and Get() methods///////////////////////////////////
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public int getNumOfDeposits(){
        return depositsThisMonth;
    }
    
    public void setNumOfDeposits(int depositsThisMonth){
        this.depositsThisMonth = depositsThisMonth;
    }
    
    public int getNumOfWithdrawals(){
        return withdrawals;
    }
    
    public void setNumOfwithdrawals(int withdrawals){
        this.withdrawals = withdrawals;
    }
    
    public double getApr(){
        return AnnualInterestRate;
    }
    
    public void setApr(double AnnualInterestRate){
        this.AnnualInterestRate = AnnualInterestRate;
    }
    
    public double getServiceCharge(){
        return MonthlyServiceCharge;
    }
    
    public void setServiceCharge(double MonthlyServiceCharge){
        this.MonthlyServiceCharge = MonthlyServiceCharge;
    }
}
