package com.luxoft.jva;

import java.io.Serializable;
import java.util.Objects;

public class PersonOneNioWithFriend implements Serializable {

    private int id;
    private String name;
    private PersonOneNioWithFriend friend;

    public PersonOneNioWithFriend(int id, String name, PersonOneNioWithFriend friend) {
        this.id = id;
        this.name = name;
        this.friend = friend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonOneNioWithFriend getFriend() {
        return friend;
    }

    public void setFriend(PersonOneNioWithFriend friend) {
        this.friend = friend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonOneNioWithFriend that = (PersonOneNioWithFriend) o;
        return id == that.id &&
            name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
