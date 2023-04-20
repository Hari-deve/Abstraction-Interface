import java.util.Scanner;

public class TransactionsByUser {
    static Scanner choose=new Scanner(System.in);

    public static void main(String[] args) {
        UserAtBank userAtBank=new UserAtBank(20000,12000);
        System.out.println("Please Enter your AccountNumber\n"+userAtBank.accountNumber);
        long reenterAccountNumber=choose.nextLong();
        if (reenterAccountNumber== userAtBank.accountNumber){
            boolean transactions=true;
            while(transactions) {
                System.out.println("Please select the option given Below\n1.Deposit\n2.Withdraw\n3.Exit");
                int select = choose.nextInt();
                if (select == 1) {
                    userAtBank.depositAmount(userAtBank.depositAmount);
                    userAtBank.balanceCheck();
                    System.out.println("Do you want to Continue Transactions \n1.Yes\n2.No");
                    int continueTransaction=choose.nextInt();
                    if (continueTransaction == 1) {
                        System.out.println("Please continue the steps as before");
                    }else {
                        transactions=false;
                        System.out.println("ThankYou Visit Again");
                    }
                } else if (select == 2) {
                    userAtBank.withdraw(userAtBank.withdrawnAmount);
                    userAtBank.balanceAfterWithdrawl();
                    System.out.println("Do you want to Continue Transactions \n1.Yes\n2.No");
                    int continueTransaction=choose.nextInt();
                    if (continueTransaction == 1) {
                        System.out.println("Please continue the steps as before");
                    }else {
                        transactions=false;
                        System.out.println("ThankYou Visit Again");
                    }
                }else {
                    System.out.println("ThankYou Visit Agian");
                    transactions=false;
                }
            }
        }


    }
}
