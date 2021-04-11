package com.springmvc.rest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Book {
    private String name;
    private int pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name);
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }


}
