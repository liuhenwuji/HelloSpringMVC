package com.controller;

import com.model.Item;
import com.service.ItemService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ItemsController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ItemService itemService = new ItemService();
        List<Item> items = itemService.getAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items", items);

        modelAndView.setViewName("/WEB-INF/pages/Items.jsp");

        return modelAndView;
    }
}
