public class Main {
    public static void main(String[] args) {
        Antivirus antivirusWithKey = new Antivirus("ABCD-1234-EFGH-5678");

        Antivirus freeAntivirus = new Antivirus();

        Transaction successfulTransaction = new Transaction(true);
        antivirusWithKey.processTransaction(successfulTransaction);

        antivirusWithKey.checkActivationStatus();
        freeAntivirus.checkActivationStatus();

        Transaction unsuccessfulTransaction = new Transaction(true);
        freeAntivirus.processTransaction(unsuccessfulTransaction);

        freeAntivirus.checkActivationStatus();
    }

}
