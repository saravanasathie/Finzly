
public class MadGovt {
    public static void main(String[] args) {
        Main madGovt = new Main();

        System.out.println(madGovt.method().get("India"));
        System.out.println(madGovt.method().get("India").get("TamilNadu"));
        System.out.println(madGovt.method().get("India").get("TamilNadu").get("Madurai"));

    }
}
