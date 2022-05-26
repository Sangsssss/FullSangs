package repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import Insurance.Insurance;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class InsuranceRepository {

    private final EntityManager em;

    public void save(Insurance insurance) {
        if (insurance.getInsuranceIdx() == null) {
            em.persist(insurance);
        }
        else{
            em.merge(insurance);
        }
    }

    public Insurance findOne(Long insuranceIdx) {
        return em.find(Insurance.class, insuranceIdx);
    }

    public List<Insurance> findAll() {
        return em.createQuery("select i from Insurance i", Insurance.class)
                .getResultList();
    }
}
