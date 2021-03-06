package by.bobruisk.ejb;


import by.bobruisk.domain.Students;
import by.bobruisk.domain.Univers;
import org.apache.log4j.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Stateless
@LocalBean
public class StudentManagerBin {
    final static Logger logger = Logger.getLogger(StudentManagerBin.class);


    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;
@Transactional
    public Students addStudent(String surname, String name, int age, Univers univer){
        Students student = new Students();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
       student.setUniver(univer);
    logger.debug("Query getAllStudents from StudentsManagerBean");

        entityManager.persist(student);
        return student;
    }

    public List<Students> getAllStudents(){
    logger.debug("Query getAllStudents from StudentsManagerBean");
        Query query = entityManager.createQuery("SELECT student FROM Students student");
        return query.getResultList();
    }


}
