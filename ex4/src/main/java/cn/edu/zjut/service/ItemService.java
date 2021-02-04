package cn.edu.zjut.service;

import cn.edu.zjut.bean.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemService {
    public List getAllItems() {
        List items = new ArrayList();
        items.add(new Item("book001", "JAVAEE技术实验指导教程",
                "WEB程序设计知识回顾、" + "轻量级JAVAEE应用框架、"
                        + "企业级EJB组件编程技术、" + "JAVAEE综合应用开发.", 19.95));
        items.add(new Item("book002", "JAVAEE技术", "Struts框架、Hibernate框架、Spring框架、"
                + "会话Bean、实体Bean、消息驱动Bean", 29.95));
        return items;
    }
}
