package com.entity;

public class Book implements Comparable{
    private String id;
    private String name;
    private String author;

    public void read()
    {
        System.out.println("读"+id);
    }

    public Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        System.out.println("创建了一个Book对象 "+name);
    }

    public Book()
    {
        System.out.println("1");
        read();
        System.out.println("2");
    }

    //比较器
    @Override
    public int compareTo(Object o) {
        return Integer.parseInt(this.getId())-Integer.parseInt(((Book)o).getId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString()
    {
        return this.id+"号图书《"+this.name+"》，作者是"+this.author;
    }
}
