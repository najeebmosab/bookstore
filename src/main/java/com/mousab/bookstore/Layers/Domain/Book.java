package com.mousab.bookstore.Layers.Domain;

import java.time.Instant;
import java.util.Objects;

public class Book {
    private String name;
    private Double price;
    private Instant createAt;
    private Boolean isReade;
    public Book(){}
    public Book(String name, Double price, Instant createAt, Boolean isReade) {
        this.name = name;
        this.price = price;
        this.createAt = createAt;
        this.isReade = isReade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(price, book.price) && Objects.equals(createAt, book.createAt) && Objects.equals(isReade, book.isReade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, createAt, isReade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Boolean getReade() {
        return isReade;
    }

    public void setReade(Boolean reade) {
        isReade = reade;
    }
}
