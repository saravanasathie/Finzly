public class StudentMember extends LibraryMember{
    public StudentMember(int memberID, String name){
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
