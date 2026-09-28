import java.util.ArrayList;

interface accounts {
    void deposit(double amount) ;


    void withdraw(double amount) throws Exception;
    double getBalance();

}

class savingsaccounts implements accounts{
    double balance;

    savingsaccounts(double balance){
        this.balance=balance;
    }

    @Override
    public void deposit(double amount) {
        balance=balance+amount;

    }
    @Override
    public void withdraw(double amount) throws Exception{
        if(balance-amount<0){
            throw new Exception("insufficient balance");
        }
        balance=balance-amount;
    }
    public double getBalance(){
        return  balance;
    }
}

class currentaccounts implements accounts{
    double balance;

    currentaccounts(double balance){
        this.balance=balance;
    }
    public void deposit(double amount) {
        balance=balance+amount;

    }
    @Override
    public void withdraw(double amount) throws Exception{
        if(balance-amount<0){
            throw new Exception("insufficient balance");
        }
        balance=balance-amount;
    }
    public double getBalance(){
        return  balance;
    }
}




public class AccountsCheck{
    public static void main(String[] args) {
        ArrayList<accounts> accounts=new ArrayList<>();
        accounts.add(new savingsaccounts(2000));
        accounts.add(new currentaccounts(600));
        for(accounts acc: accounts){
            try{
                acc.withdraw(700);
                System.out.println("withdrawn blance:"+acc.getBalance());
            } catch (Exception e) {
                System.out.println("Error:"+e.getMessage());
            }
        }
    }
}

