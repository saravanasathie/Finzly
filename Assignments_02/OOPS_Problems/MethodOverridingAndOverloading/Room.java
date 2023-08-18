public class Room{
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
    private boolean isReserved;

    public Room(int roomNumber, int capacity, double pricePerNight){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.isReserved = false;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public int getCapacity(){
        return capacity;
    }
    public double getPricePerNight(){
        return pricePerNight;
    }
    public boolean isReserved(){
        return isReserved;
    }
    public boolean checkAvailability(){
        return !isReserved;
    }
    public void makeReservation(){
        if(!isReserved){
            isReserved = true;
            System.out.println("Room reserved "+ roomNumber);
        }else {
            System.out.println("Room "+ roomNumber + "already reserved");
        }
    }
    public void makeReservation(String checkInDate, String checkOutDate){
        if(!isReserved){
            isReserved = true;
            System.out.println("Room reserved "+ roomNumber + " from "+checkInDate+" till "+checkOutDate);
        }else {
            System.out.println("Room "+roomNumber+ "already reserved");
        }
    }
    @Override
    public String toString(){
        return "Room "+ roomNumber + " - capacity "+ capacity+ ", PricePerNight $"+pricePerNight;
    }
}