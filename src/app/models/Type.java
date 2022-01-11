package app.models;

import java.text.MessageFormat;
import java.util.Arrays;

import app.interfaces.IType;
import app.shared.Templates;

public class Type extends BaseModel implements IType {

    private String name;
    private int places;
    private String[] services;

    private static int counter = 0;

    public Type(String name, int places, String[] services) {
        super(counter);

        this.name = name;
        this.places = places;
        this.services = services;
    }

    @Override
    public int id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int places() {
        return this.places;
    }

    @Override
    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    public String[] services() {
        return this.services;
    }

    @Override
    public void setServices(String[] services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return MessageFormat.format(Templates.type, this.id, this.name, this.places, Arrays.toString(this.services));
    }

    public boolean equals(Type obj) {
        return
            this.id() == obj.id() &&
            this.name().equals(obj.name()) &&
            this.places() == obj.places() &&
            Arrays.equals(this.services(), obj.services());
    }
}
