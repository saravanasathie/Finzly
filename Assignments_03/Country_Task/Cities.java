
public class Cities {
    private String name;
    private String dist;
    public Cities(){
        super();
    }

    public Cities(String name, String dist){
        super();
        this.name = name;
        this.dist = dist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return "City Name : "+ this.getName()+ " and Main District : "+this.getDist();
    }
}
