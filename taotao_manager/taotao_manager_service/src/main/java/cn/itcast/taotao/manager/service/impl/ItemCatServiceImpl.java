package cn.itcast.taotao.manager.service.impl;

import cn.itcast.taotao.manager.mapper.ItemCatMapper;
import cn.itcast.taotao.manager.pojo.ItemCat;
import cn.itcast.taotao.manager.service.ItemCatService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.manager.service.impl
 * @date 2018/1/9
 */
@Service
public class ItemCatServiceImpl implements ItemCatService{
    @Autowired
    private ItemCatMapper itemCatMapper;

        @Override
        public List<ItemCat> queryItemCatByPage(Integer page, Integer rows) {
            PageHelper.startPage(page,rows);

            return itemCatMapper.selectByExample(null);
        }


}
