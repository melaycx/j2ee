package cn.edu.zjut.po;

import java.sql.Blob;

public class Item {
    private ItemPK ipk;
    private String description;
    private Float cost;
    private Blob image;

    public Item() {
    }

    public Item(ItemPK ipk, String description, Float cost, Blob image) {
        this.ipk = ipk;
        this.description = description;
        this.cost = cost;
        this.image = image;
    }

    public ItemPK getIpk() {
        return ipk;
    }

    public void setIpk(ItemPK ipk) {
        this.ipk = ipk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
