package com.service;

import com.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    public List<Item> getAll() {
        List<Item> items = new ArrayList<Item>();
        Item item1 = new Item();
        item1.setName("联想笔记本");
        item1.setPrice(6000f);
        item1.setDetail("ThinkPad T430联想笔记本!");

        Item item2 = new Item();
        item2.setName("苹果手机");
        item2.setPrice(5000f);
        item2.setDetail("Iphone6苹果手机");

        items.add(item1);
        items.add(item2);
        return items;
    }
}
