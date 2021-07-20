package com.entity;

public class Fiction extends Book{
    private String id;
    public Fiction(String id, String name, String author) {
        super(id, name, author);
        System.out.println("创建了一个Fiction对象");
    }
}
