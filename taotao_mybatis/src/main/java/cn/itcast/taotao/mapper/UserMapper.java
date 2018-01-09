package cn.itcast.taotao.mapper;

import cn.itcast.taotao.pojo.User;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.mapper
 * @date 2018/1/9
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    User queryUserById(Long id);

    /**
     * 新增
     *
     * @param user
     */
    void saveUser(User user);

    /**
     * 更新
     *
     * @param user
     */
    void updateUserById(User user);

    /**
     * 根据id删除
     *
     * @param id
     */
    void deleteUserById(Long id);

}


