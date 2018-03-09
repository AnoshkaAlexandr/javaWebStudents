package by.bobruisk.domain;



import javax.persistence.*;
import java.util.List;

@Entity
public class Univers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long univerId;

    private String label;

    private double avg_age;

    @OneToMany(mappedBy="univer")

    private List<Students> listOfStudents;

    public List<Students> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Students> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public long getUniverId() {
        return univerId;
    }

    public void setUniverId(long id) {
        this.univerId = id;
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
