package test;

import com.ljy.dao.User.UserMapper;
import com.ljy.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

public class TestMybatis {

    @Test
    public void test1() throws IOException {
        String resource = "spring-mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
            List<User> list = mapper.getAll();
            System.out.println(list.toString());
        } finally {
            session.close();
        }
    }

    @Test
    public void test2() throws IOException {
        String resource = "spring-mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        try {
            UserMapper mapper = session.getMapper(UserMapper.class);
//            User user = new User();
//            user.setId(3);
//            user.setUserName("l");
//            User getUser = mapper.getUserForNameAndId(user);
//            System.out.println(getUser);

//            HashMap<String, String> map = new HashMap<String, String>();
//            map.put("userName", "l");
//            map.put("id", "3");
//            User getUser = mapper.getUserForNameAndIdMap(map);
//            System.out.println(getUser);
        }finally {

        }

    }

    @Test
    public void test3() throws IOException {
//        String resource = "spring-mybatis.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession session = sqlSessionFactory.openSession();
//
//        try {
//            UserMapper mapper = session.getMapper(UserMapper.class);
//            List<User> getUser = mapper.getUserMapForName();
//            System.out.println(getUser);
//        }finally {
//
//        }

    }
}
