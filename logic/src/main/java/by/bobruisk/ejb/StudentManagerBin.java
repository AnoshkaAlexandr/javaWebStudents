package by.bobruisk.ejb;


import by.bobruisk.domain.Students;
import by.bobruisk.domain.Univers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@LocalBean
public class StudentManagerBin {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

    public Students addStudent(String surname, String name, int age, Univers univer){
        Students student = new Students();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
       student.setUniver(univer);

        entityManager.persist(student);
        return student;
    }

    public List<Students> getAllStudents(){
        Query query = entityManager.createQuery("SELECT student FROM Students student");
        return query.getResultList();
    }


}
