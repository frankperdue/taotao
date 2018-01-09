package cn.itcast.taotao.test;


import cn.itcast.taotao.mapper.UserMapper;
import cn.itcast.taotao.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.test
 * @date 2018/1/9
 */
public class UserTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void loadSqlSessionFactory() throws IOException {
        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        sqlSessionFactory = builder.build(is);
    }

    @Test
    public void fun01(){
        SqlSession sqlSession = this.sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.queryUserById(2L);

        System.out.println(user);

        sqlSession.close();

    }
}
