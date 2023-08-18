public class StaffMember extends LibraryMember{
    public StaffMember(int memberID, String name){
        super(memberID, name);
    }

    @Override
    public void borrowItem(LibraryItem item) {
        System.out.println("Member ID : " + super.getMemberID() + " Name : "+super.getName());
    }

    @Override
    public void reserveItem(LibraryItem item) {
        System.out.println(item.displayInfo());
    }
}
