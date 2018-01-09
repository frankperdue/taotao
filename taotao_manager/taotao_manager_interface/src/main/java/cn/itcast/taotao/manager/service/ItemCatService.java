package cn.itcast.taotao.manager.service;

import cn.itcast.taotao.manager.pojo.ItemCat;

import java.util.List;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.manager.service
 * @date 2018/1/9
 */
public interface ItemCatService {
    List<ItemCat> queryItemCatByPage(Integer page,Integer rows);
}
