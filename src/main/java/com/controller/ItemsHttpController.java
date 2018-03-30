package com.controller;

import com.model.Item;
import com.service.ItemService;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ItemsHttpController implements HttpRequestHandler {

    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ItemService itemService = new ItemService();
        List<Item> items = itemService.getAll();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/WEB-INF/pages/Items.jsp").forward(request, response);
    }
}
