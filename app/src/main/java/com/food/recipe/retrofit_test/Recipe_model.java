package com.food.recipe.retrofit_test;

/**
 * Created by pc on 5/10/2017.
 */

public class Recipe_model {
    private String id;
    private String img;
    private String title;
    private String publisher_name;
    private String pubDate;
    private String status;

    /**
     * No args constructor for use in serialization
     *
     */
    public Recipe_model() {
    }

    /**
     *
     * @param id
     * @param pubDate
     * @param title
     * @param status
     * @param publisherName
     * @param img
     */
    public Recipe_model(String id, String img, String title, String publisherName, String pubDate, String status) {
        super();
        this.id = id;
        this.img = img;
        this.title = title;
        this.publisher_name = publisherName;
        this.pubDate = pubDate;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisherName() {
        return publisher_name;
    }

    public void setPublisherName(String publisherName) {
        this.publisher_name = publisherName;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}