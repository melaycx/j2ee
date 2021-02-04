package cn.edu.zjut.po;
import java.sql.Blob;

public class Item {
    private String itemID;
    private String title;
    private String description;
    private float cost;
    private Blob image;

    public Item() {
    }
    public Item(String itemID) {
        this.itemID = itemID;
    }
    public Item(String itemID, String title, String description,
                float cost, Blob image) {
        this.itemID=itemID;
        this.title=title;
        this.description=description;
        this.cost=cost;
        this.image=image;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public Blob getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getItemID() {
        return itemID;
    }

    public float getCost() {
        return cost;
    }

}