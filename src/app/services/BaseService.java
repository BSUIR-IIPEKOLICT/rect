package app.services;

import java.util.ArrayList;

import app.interfaces.IEntity;

public class BaseService<T> implements IEntity {
    protected final ArrayList<T> collection;

    public BaseService(ArrayList<T> collection) {
        this.collection = collection;
    }

    public int delete(int id) {
        this.collection.remove(id - 1);
        return id;
    }
}
