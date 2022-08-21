package web.model;

public class Car {
    private int id;
    private String model;
    private int yearOfIssue;

    public Car(int id, String model, int yearOfIssue) {
        this.id = id;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
