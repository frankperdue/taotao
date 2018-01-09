package cn.itcast.taotao.test;

import cn.itcast.taotao.mapper.NewUserMapper;
import cn.itcast.taotao.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.test
 * @date 2018/1/9
 */
public class NewUserTest {
    @Autowired
    private NewUserMapper userMapper;
    @Before
    public void init() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 参数为true，设置事务是自动提交
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
       userMapper = sqlSession.getMapper(NewUserMapper.class);
    }

    @Test
    public void testSelectOne() {
        User param = new User();
        param.setId(1L);
        /* param.setSex(1);*/

        User user = userMapper.selectOne(param);
        System.out.println(user);
    }
    @Test
    public void testQueryPage(){
        Map<String, Integer> param=new HashMap<>();
        param.put("page",0);
        param.put("rows",5);
        List<User> user = userMapper.queryUserByPage(param);
        System.out.println(user.size());

    }
    @Test
    public void testQueryHelper(){
        PageHelper.startPage(1,2);
        List<User> users = userMapper.selectByExample(null);
        for (User user : users) {
            System.out.println(user.toString());
        }
        PageInfo<User> pageInfo=new PageInfo<User>(users);
        System.out.println(pageInfo.getPages());
        System.out.println(pageInfo.getTotal());
    }
}
