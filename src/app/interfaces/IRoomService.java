package app.interfaces;

import java.util.ArrayList;

public interface IRoomService extends IEntity {
    ArrayList<IRoom> getAll();
    IRoom create(int typeId, int buildingId, boolean isFree);
    IRoom change(int id, int typeId, int buildingId, boolean isFree);
}
