package com.controller;

import com.model.Item;
import com.service.ItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ItemsAnnotationController {

    //一般建议和方法名写得一样
    @RequestMapping("/query3")
    public ModelAndView queryItem() {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.getAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items", items);

        modelAndView.setViewName("/WEB-INF/pages/Items.jsp");

        return modelAndView;
    }
}
