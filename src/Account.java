package Task3_11;

public class Account {

    private String name;
    private double balance;

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;

        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance += depositAmount;
        }
    }

    public void widrow(double widrowAmount){
        if(widrowAmount > balance){
            System.out.println("Withdrawal amount exceeded account balance");
        }else{
            balance -= widrowAmount;
        }
    }

}