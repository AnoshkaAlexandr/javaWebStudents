package by.bobruisk.domain;

import javax.persistence.*;

@Entity

public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Surname;
    private String Name;
    private int age;
    @ManyToOne

    private Univers univer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Univers getUniver() {
        return univer;
    }


    public void setUniver(Univers univer) {
        this.univer = univer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
