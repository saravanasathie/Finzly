public class Antivirus {
    private String productKey;
    private boolean isActivated;

    public Antivirus(String productKey) {
        this.productKey = productKey;
        this.isActivated = false;
    }

    public Antivirus() {
        this.productKey = null;
        this.isActivated = false;
    }

    public void processTransaction(Transaction transaction) {
        if (transaction.isTransactionCompleted()) {
            this.isActivated = true;
            System.out.println("Product key activated for antivirus.");
        } else {
            System.out.println("Transaction is not done - please pay first to activate product key.");
        }
    }

    public void checkActivationStatus() {
        if (isActivated) {
            System.out.println("Antivirus is activated.");
        } else {
            System.out.println("You are using free version, please upgrade.");
        }
    }
}
