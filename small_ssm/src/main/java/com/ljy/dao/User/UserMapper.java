package com.ljy.dao.User;

import com.ljy.model.User;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    List<User> getAll();
    User getOneUserInfo(int id);
    List<User> getUserForName(String name);
//    User getUserForNameAndId(User user);
//    User getUserForNameAndIdMap(Map m);
//    List<User> getUserMapForName();
}
