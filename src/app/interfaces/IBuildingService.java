package app.interfaces;

import java.util.ArrayList;

public interface IBuildingService extends IEntity {
    ArrayList<IBuilding> getAll();
    IBuilding create(String address);
    IBuilding change(int id, String address);
}
