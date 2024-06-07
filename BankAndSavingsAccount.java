
import javax.swing.JOptionPane;



/**
 *
 * @author Ricardo Zelante
 */
public class BankAndSavingsAccount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double balance;
        double apr;
        
        balance = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter a beginning balance."));
        
        apr = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter an Annual Percentage Rate."));
        
        BankAccount savingsAccount = new SavingsAccount(balance, apr);
        
        String string1 = "Balance: $" + savingsAccount.getBalance()
                   + "\nInterest: $" + savingsAccount.getApr()
                   + "\nDeposits: " + savingsAccount.getNumOfDeposits()
                   + "\nWithdrawals: " + savingsAccount.getNumOfWithdrawals();
        
        JOptionPane.showMessageDialog(null, string1);
        
        Boolean restart = true;
        while (restart){
            String string2 = "What would you like to do?"
                + "\nEnter (D) to deposit"
                + "\nEnter (W) to withdraw"
                + "\nEnter (B) for balance"
                + "\nEnter (M) for monthy process"
                + "\nEnter (E) to exit";
        
        String userInput = JOptionPane.showInputDialog(null,string2);
        
        switch (userInput){
            case "d":
            case "D":
                double deposit = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the deposit amount."));
                savingsAccount.deposit(deposit);
                JOptionPane.showMessageDialog(null, "Balance: $" + savingsAccount.getBalance()
                   + "\nInterest: $" + savingsAccount.getApr()
                   + "\nDeposits: " + savingsAccount.getNumOfDeposits()
                   + "\nWithdrawals: " + savingsAccount.getNumOfWithdrawals());
                restart = true;
                break;
                
            case "w":
            case "W":
                double withdrawn = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the withdrawal amount."));
                savingsAccount.withdraw(withdrawn);
                JOptionPane.showMessageDialog(null, "Balance: $" + savingsAccount.getBalance()
                   + "\nInterest: $" + savingsAccount.getApr()
                   + "\nDeposits: " + savingsAccount.getNumOfDeposits()
                   + "\nWithdrawals: " + savingsAccount.getNumOfWithdrawals());
                restart = true;
                break;
                
            case "b":
            case "B":
                savingsAccount.getBalance();
                JOptionPane.showMessageDialog(null, "Balance: $" + savingsAccount.getBalance()
                   + "\nInterest: $" + savingsAccount.getApr()
                   + "\nDeposits: " + savingsAccount.getNumOfDeposits()
                   + "\nWithdrawals: " + savingsAccount.getNumOfWithdrawals());
                restart = true;
                break;
                
            case "m":
            case "M":
                savingsAccount.monthlyProcess();
                JOptionPane.showMessageDialog(null, "Balance: $" + savingsAccount.getBalance()
                   + "\nInterest: $" + savingsAccount.getApr()
                   + "\nDeposits: " + savingsAccount.getNumOfDeposits()
                   + "\nWithdrawals: " + savingsAccount.getNumOfWithdrawals());
                restart = true;
                break;
                
            case "e":
            case "E":
                restart = false;
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Invalid selection");
                restart = true;
        }
        
        
        }
        
        
        
    }
    
}
