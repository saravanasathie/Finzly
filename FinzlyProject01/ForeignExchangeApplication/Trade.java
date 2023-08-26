public class Trade{
    private int tradeNo;
    private String currencyPair;
    private String customerName;
    private double amount;

    public int getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(int tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getCurrencyPair() {
        return currencyPair;
    }

    public void setCurrencyPair(String currencyPair) {
        this.currencyPair = currencyPair;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    private double rate;

    Trade(int tradeNo, String currencyPair, String customerName, double amount, double rate){
        this.tradeNo = tradeNo;
        this.currencyPair = currencyPair;
        this.customerName = customerName;
        this.amount = amount;
        this.rate = rate;
    }

}
