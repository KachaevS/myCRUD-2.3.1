package web.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class userDaoImpl implements userDao {


    private final EntityManagerFactory emf;
    private final EntityManager em;

    @Autowired
    public userDaoImpl(EntityManagerFactory emf, EntityManager em) {
        this.emf = emf;
        this.em = em;
    }

    @Override
    public List<User> allUsers() {
        String query = "SELECT u FROM User u";
        return em.createQuery(query, User.class).getResultList();
    }

    @Override
    public void add(User user) {
        em.persist(user);
    }

    @Override
    public void delete(User user) {
        em.remove(em.contains(user) ? user : em.merge(user));

    }

    @Override
    public void edit(User user) {
        em.merge(user);

    }

    @Override
    public User getById(int id) {
        return em.find(User.class, id);
    }

}
