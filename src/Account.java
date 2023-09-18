public class Account {
    private int accNumber;
    private int id_client;
    private String type;
    private double balance;

    public Account(int accNumber, int id_client,String type, double balance){
        this.accNumber = accNumber;
        this.id_client = id_client;
        this.type = type;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getId_client() {
        return id_client;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void toDeposit(double value){
        this.balance += value;
    }

    public void toWithdraw(double value) {this.balance -= value; }

}
