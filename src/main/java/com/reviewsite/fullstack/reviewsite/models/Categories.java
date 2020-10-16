package com.reviewsite.fullstack.reviewsite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Categories {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "categories")
    private Collection<Albums> albums;

    protected Categories(){
    }

    public  Categories(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

    public Collection<Albums> getAlbums(){
        return albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categories that = (Categories) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
