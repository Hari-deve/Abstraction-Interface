public class UserAtBank implements IndaneBankDeposit, IndaneBankWithdraw {
    long accountNumber = 6754324567l;
    double balance = 1000;
    double depositAmount;
    double withdrawnAmount;

    public UserAtBank() {
    }

    public UserAtBank(double depositAmount, double withdrawnAmount) {
        this.depositAmount = depositAmount;
        this.withdrawnAmount = withdrawnAmount;
    }

    @Override
    public void depositAmount(double depositedAmount) {
        balance+=depositedAmount;
        System.out.println("Amount "+depositedAmount+" was added successfully");
    }

    @Override
    public void balanceCheck() {
        System.out.println("Balance amount: "+balance);

    }

    @Override
    public void withdraw(double withdraw) {
        if (balance>withdraw){
            balance-=withdraw;
            System.out.println("Amount Withdrawn Successfully");
        }else {
            System.out.println("You don't have much Balance");
        }
    }

    @Override
    public void balanceAfterWithdrawl() {
        System.out.println("Your Balance: "+balance);

    }
}
