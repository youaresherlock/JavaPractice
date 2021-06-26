package foundation;

public class InsufficientFundsException extends Exception{
    // 异常所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}






































