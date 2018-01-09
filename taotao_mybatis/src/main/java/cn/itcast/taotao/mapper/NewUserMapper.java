package cn.itcast.taotao.mapper;

import cn.itcast.taotao.pojo.User;
import com.github.abel533.mapper.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.mapper
 * @date 2018/1/9
 */
public interface NewUserMapper extends Mapper<User> {
    /**
     * 分页查询
     * @return
     */
    List<User> queryUserByPage(Map<String,Integer> param);
}
