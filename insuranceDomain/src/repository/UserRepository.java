package repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import Accident.Accident;
import User.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public void save(User user) {
        if (user.getUserIdx() == null) {
            em.persist(user); //�깉濡� 媛��엯
        }
        else{
            em.merge(user); // update
        }
    }

    public User findOne(Long userIdx) {
        return em.find(User.class, userIdx);
    }

    public List<User> findAll() {
        return em.createQuery(
                "select u from User u", User.class)
                .getResultList();

    }

    public List<User> findCheckUwUserList(UserSearch userSearch) {
        String jpql = "select a from Accident a join a.user u";
        boolean isFirstCondition = true;

        if (userSearch.getLawsuitStatus() != null) {
            if (isFirstCondition) {
                jpql += "where";
                isFirstCondition = false;
            }
            else{
                jpql += " and";
            }

            jpql += "a.lawsuitStatus = :lawsuitStatus";
        }

        //留뚯빟 �씠由� 寃��깋�븳�떎硫� �뿬湲� �쉶�썝 寃��깋 異붽�


        TypedQuery<User> query = em.createQuery(jpql, User.class)
                .setMaxResults(1000);
        if (userSearch.getLawsuitStatus() != null) {
            query = query.setParameter("lawsuitStatus", userSearch.getLawsuitStatus());
        }
        // �쉶�썝 異붽�

        return query.getResultList();
    }

    public List<User> findDelinquentList() {
        //�닔�젙
        return null;
    }

    public List<User> findMaturityUserList() {
        //�닔�젙
        return null;
    }
}
