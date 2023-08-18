public class Book extends LibraryItem{
    private String author;

    Book(String title, int itemID, String author){
        super(title, itemID);
        this.author = author;
    }
    @Override
    public String displayInfo(){
        return super.displayInfo()+" and the Author of the Book is "+this.author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author1){
        this.author = author1;
    }
}
