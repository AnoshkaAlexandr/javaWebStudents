package by.bobruisk.ejb;

import by.bobruisk.domain.Univers;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
public class UniverManagerBin {

    @PersistenceContext(unitName = "examplePU")
    EntityManager entityManager;

    public Univers addUniver(String label) {
        Univers univer = new Univers();
        univer.setLabel(label);

        entityManager.persist(univer);
        return univer;

    }

    public List<Univers> getAllUnivers() {
        TypedQuery query = entityManager.createQuery("SELECT univer FROM Univers univer", Univers.class);
        return query.getResultList();


    }


}
