package app.services;

import java.util.ArrayList;

import app.interfaces.IType;
import app.interfaces.ITypeService;
import app.models.Type;

public class TypeService extends BaseService<IType> implements ITypeService {

    public TypeService(ArrayList<IType> collection) {
        super(collection);
    }

    @Override
    public ArrayList<IType> getAll() {
        return this.collection;
    }

    @Override
    public IType create(String name, int places, String[] services) {
        IType type = new Type(name, places, services);
        this.collection.add(type);
        return type;
    }

    @Override
    public IType change(int id, String name, int places, String[] services) {
        IType type = this.collection.get(id - 1);
        type.setName(name);
        type.setPlaces(places);
        type.setServices(services);
        return type;
    }
}
