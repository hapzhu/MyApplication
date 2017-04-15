package com.example.hapzhu.andrioddemotest;

import org.litepal.annotation.Column;
import org.litepal.crud.DataSupport;

import java.util.Arrays;

/**
 * Created by hapzhu on 2017/4/6.
 */

public class Movie extends DataSupport {

    private long id;

    //name是唯一的，且默认值为unknown
    @Column(unique = true, defaultValue = "unknown")
    private String name;
    //忽略即是不在数据库中创建该属性对应的字段
    @Column(ignore = true)
    private float price;

    private byte[] cover;

    private int duration;
    //不为空
    @Column(nullable = false)
    private String director;

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cover=" + Arrays.toString(cover) +
                ", duration=" + duration +
                ", director='" + director + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
