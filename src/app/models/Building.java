package app.models;

import java.text.MessageFormat;

import app.interfaces.IBuilding;
import app.shared.Templates;

public class Building extends BaseModel implements IBuilding {

    private String address;

    private static int counter = 0;

    public Building(String address) {
        super(counter);
        this.address = address;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public String address() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return MessageFormat.format(Templates.building, this.id, this.address);
    }

    public boolean equals(Building obj) {
        return this.id() == obj.id() && this.address().equals(obj.address());
    }
}
