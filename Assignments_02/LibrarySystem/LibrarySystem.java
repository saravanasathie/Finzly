public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Treasurer", 23, "rahit");
        System.out.println(book.displayInfo());

        DVD dvd = new DVD("Inception", 2001, 148);
        System.out.println(dvd.displayInfo());

        LibraryMember student = new StudentMember(5001, "John Doe");
        LibraryMember faculty = new StaffMember(7001, "Dr. Smith");

        student.borrowItem(book);
        faculty.borrowItem(dvd);

        student.reserveItem(book);
        faculty.reserveItem(dvd);


    }
}
