package by.bobruisk.domain;


import org.apache.log4j.Logger;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Entity
public class Univers {
    final static Logger logger = Logger.getLogger(Univers.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label;

    private double avg_age;

    @OneToMany(mappedBy = "univer",  orphanRemoval = true)
    private List<Students> studentsInUniver;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
@Transactional

    public List<Students> getStudentsInUniver() {
    logger.debug("from univers");

    return studentsInUniver;
    }
@Transactional
    public void setStudentsInUniver(List<Students> studentsInUniver) {
        this.studentsInUniver = studentsInUniver;
    }

    @Override
    public String toString() {
        return "Univer " + label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Univers univers = (Univers) o;
        return  Objects.equals(id, univers.id) &&
                Objects.equals(label, univers.label);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, label);
    }



}
