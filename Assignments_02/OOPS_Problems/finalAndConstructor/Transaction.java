public class Transaction {
    private boolean isTransactionCompleted;

    public Transaction(boolean isTransactionCompleted) {
        this.isTransactionCompleted = isTransactionCompleted;
    }

    public boolean isTransactionCompleted() {
        return isTransactionCompleted;
    }
}
