package web.model;


public class User {
    private int id;
    private String name;
    private int yearOfBirth;

    public User() {
    }

    public User(int id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" +
                ", name: " + name + "\n" +
                ", Year Of Birth: " + yearOfBirth;
    }
}
