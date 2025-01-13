package ioc.container.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public Boolean addUsers(User user1, User user2) {
        userDao.insertUser(user1);
        // int i = 1 / 0;
        userDao.insertUser(user2);
        return true;
    }

}
