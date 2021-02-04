package cn.edu.zjut.action;

import cn.edu.zjut.service.ItemService;

import java.util.ArrayList;
import java.util.List;
public class ItemAction {
    private List items=new ArrayList<cn.edu.zjut.po.Item>();

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public String getAllItems(){
        ItemService service=new ItemService();
        items=service.getAllItems();
        return  "success";
    }
}
