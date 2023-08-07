package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class userDaoImpl implements userDao {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static final Map <Integer, User> users = new HashMap<>();


    static {
        User user1 = new User(AUTO_ID.getAndIncrement(), "James" , 1931);
        User user2 = new User(AUTO_ID.getAndIncrement(), "Lore" , 1954);
        User user3 = new User(AUTO_ID.getAndIncrement(), "Sandy" , 2000);
        User user4 = new User(AUTO_ID.getAndIncrement(), "Greg" , 1988);
        users.put(1, user1);
        users.put(2, user2);
        users.put(3, user3);
        users.put(4, user4);
    }

    @Override
    public List<User> allUsers() {
        return new ArrayList<>(users.values());
    }

    @Override
    public void add(User user) {
        user.setId(AUTO_ID.incrementAndGet());
        users.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        users.remove(user.getId());
    }

    @Override
    public void edit(User user) {
        users.put(user.getId(), user);
    }

    @Override
    public User getById(int id) {
        return users.get(id);
    }
}
