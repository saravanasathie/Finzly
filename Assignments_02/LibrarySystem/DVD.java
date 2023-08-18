public class DVD extends LibraryItem{
    private int duration;

    DVD(String title, int itemID, int duration){
        super(title, itemID);
        this.duration = duration;
    }
    @Override
    public String displayInfo(){
        return super.displayInfo() + " and the Duration of the Book is "+this.duration;
    }
    public int getDuration(){
        return this.duration;
    }
    public void setDuration(int duration1){
        this.duration = duration1;
    }
}
