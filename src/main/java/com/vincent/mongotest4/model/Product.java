package com.vincent.mongotest4.model;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@Data
public class Product {
    @Id
    private ObjectId id = new ObjectId();
    private String title;
    private String type;
    private String description;
    private String filename;
    private double height;
    private double width;
    private double price;
    private int rating;

    public Product(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", filename='" + filename + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}