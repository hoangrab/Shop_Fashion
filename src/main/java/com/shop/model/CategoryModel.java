package com.shop.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CategoryModel {
    private long id;
    private String name;
    private long parentId;

    public CategoryModel(long id, String name, long parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }
}
