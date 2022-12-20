package hiber.model;

import javax.persistence.*;

@Entity
@Table(name="car")
public class Car {
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    public Car(){

    }

    public Car(String model, int series){
        this.series = series;
        this.model = model;
    }

    @Override
    public String toString() {
        return "model= " + model  +
                ", series= " + series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
