package by.bobruisk.domain;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PostPersist;
import java.util.List;

public class UniversListener {

    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

    @PostPersist
    public void summAvg(Students stu) {
        Univers uni = stu.getUniver();
        double allAge = 0D;
        List<Students> allStudents = uni.getStudentsInUniver();
        for (Students st : allStudents) {
            allAge += st.getAge();
        }

        uni.setAvg_age(allAge / allStudents.size());
        entityManager.merge(uni);
    }
}
