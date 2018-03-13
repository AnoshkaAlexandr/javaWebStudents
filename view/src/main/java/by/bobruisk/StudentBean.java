package by.bobruisk;

import by.bobruisk.domain.Students;
import by.bobruisk.domain.Univers;
import by.bobruisk.ejb.StudentManagerBin;
import org.apache.log4j.Logger;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class StudentBean implements Serializable {
    final static Logger logger = Logger.getLogger(StudentBean.class);


    @EJB
   private StudentManagerBin studentManagerBin;

    private String name;
    private String surname;
    private int age;
    private Univers univer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Univers getUniver() {        return univer;    }

    public void setUniver(Univers univer) {
        this.univer = univer;
    }

    public void addStudent(){
        studentManagerBin.addStudent(surname, name, age, univer);

    }

    public List<Students> getAllStudents(){
        return studentManagerBin.getAllStudents();
    }

}
