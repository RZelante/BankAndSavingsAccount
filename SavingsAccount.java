
import javax.swing.JOptionPane;


/**Savings account class is a subclass of Bank Account
 *
 * @author Ricardo Zelante
 */
public class SavingsAccount extends BankAccount{
    static Boolean accountStatus;
    
    public SavingsAccount(double balance, double AnnualInterestRate){
        super(balance,AnnualInterestRate);
        
        accountStatus = super.getBalance() >= 25;
    }
    
    public void withdraw(double w){
        if (accountStatus){
            super.withdraw(w);
        }
        
        if (super.getBalance() < 25){
            accountStatus = false;
            JOptionPane.showMessageDialog(null,"Account can not be withdrawn.");
        }
        else{
            JOptionPane.showMessageDialog(null,"$" + w + " has been withdrawn.");
        }
    }
    
    public void deposit(double d){
        if (!accountStatus){
            double available = super.getBalance() + d;
            if (available >= 25){
                accountStatus = true;
            }
        }
        super.deposit(d);
        JOptionPane.showMessageDialog(null,"$" + d + " has been deposited.");
    }
    
    public void monthlyProcess(){
        int withdrawCount = super.getNumOfWithdrawals();
        
        if (withdrawCount > 4){
            super.setServiceCharge(withdrawCount - 4);
        }
        super.monthlyProcess();
        
        
        if (super.getBalance() < 25){
            accountStatus = false;
        }
    }
    
    ///////////////////////////////////////////////Set() and Get() Methods//////////////////////////////////////
    public Boolean isStatus(){
        return accountStatus;
    }
    
    public void setStatus(Boolean status){
        this.accountStatus = status;
    }
    
    
}
