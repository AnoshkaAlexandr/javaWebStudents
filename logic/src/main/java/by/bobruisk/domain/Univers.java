package by.bobruisk.domain;


import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

@Entity
public class Univers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String label;

    private double avg_age;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getAvg_age() {
        return avg_age;
    }

    public void setAvg_age(double avg_age) {
        this.avg_age = avg_age;
    }

    @Override
    public String toString() {
        return "Univer " + label ;
    }
}
