public class LibraryItem {
    private String title;
    private int itemID;
    LibraryItem(String title, int itemID){
        this.title = title;
        this.itemID = itemID;
    }
    public String displayInfo(){
        return "Title of the Book : "+this.title + " ID of the Item : "+this.itemID;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title1){
        this.title = title1;
    }
    public int getItemID(){
        return this.itemID;
    }
    public void setItemID(int ItemID){
        this.itemID = ItemID;
    }
}
