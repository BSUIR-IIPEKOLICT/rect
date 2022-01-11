package app.services;

import java.util.ArrayList;

import app.interfaces.IBuilding;
import app.interfaces.IBuildingService;
import app.models.Building;

public class BuildingService extends BaseService<IBuilding> implements IBuildingService {

    public BuildingService(ArrayList<IBuilding> collection) {
        super(collection);
    }

    @Override
    public ArrayList<IBuilding> getAll() {
        return this.collection;
    }

    @Override
    public IBuilding create(String address) {
        IBuilding building = new Building(address);
        this.collection.add(building);
        return building;
    }

    @Override
    public IBuilding change(int id, String address) {
        IBuilding building = this.collection.get(id - 1);
        building.setAddress(address);
        return building;
    }
}
