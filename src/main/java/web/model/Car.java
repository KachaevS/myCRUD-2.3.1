package web.model;

public class Car {
    private String owner;
    private int id;
    private int place;

    public Car() {
    }

    public Car(String owner, int id, int place) {
        this.owner = owner;
        this.id = id;
        this.place = place;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
