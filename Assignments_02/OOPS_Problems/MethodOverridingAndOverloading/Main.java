public class Main {
    public static void main(String[] args) {
        Room room2 = new Room(118, 3, 3000);
        Room room1 = new Room(108, 4, 4000);

        System.out.println(room1);
        System.out.println(room2);

        room1.checkAvailability();

        room1.makeReservation();
        room2.makeReservation("07-10-2023","10-10-2023");

        System.out.println(room1.checkAvailability());
        System.out.println(room2.checkAvailability());

        System.out.println(room1.getRoomNumber());
        System.out.println(room2.getRoomNumber());
    }
}
