package cn.itcast.taotao.manager.controller;

import cn.itcast.taotao.manager.pojo.ItemCat;
import cn.itcast.taotao.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author frankperdue
 * @version 1.0
 * @description cn.itcast.taotao.manager.controller
 * @date 2018/1/9
 */
@Controller
@RequestMapping("itemCat")
public class ItemCatController {
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("queryItemCatByPage/{page}")
    @ResponseBody
    public List<ItemCat> queryItemCatByPage(@PathVariable("page")Integer page, @RequestParam("rows")Integer rows){
        List<ItemCat> itemCats = itemCatService.queryItemCatByPage(page, rows);
        return itemCats;
    }
}
