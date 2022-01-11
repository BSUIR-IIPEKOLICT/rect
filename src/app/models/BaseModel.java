package app.models;

import app.interfaces.IModel;

public class BaseModel implements IModel {
    protected final int id;

    protected BaseModel(int counter) {
        counter++;
        this.id = counter;
    }

    @Override
    public int id() {
        return this.id;
    }
}
