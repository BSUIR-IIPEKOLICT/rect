package app.services;

import java.util.ArrayList;

import app.interfaces.IRoom;
import app.interfaces.IRoomService;
import app.models.Room;

public class RoomService extends BaseService<IRoom> implements IRoomService {

    public RoomService(ArrayList<IRoom> collection) {
        super(collection);
    }

    @Override
    public ArrayList<IRoom> getAll() {
        return this.collection;
    }

    @Override
    public IRoom create(int typeId, int buildingId, boolean isFree) {
        IRoom room = new Room(isFree, buildingId, typeId);
        this.collection.add(room);
        return room;
    }

    @Override
    public IRoom change(int id, int typeId, int buildingId, boolean isFree) {
        IRoom room = this.collection.get(id - 1);
        room.setIsFree(isFree);
        room.setBuildingId(buildingId);
        room.setTypeId(typeId);
        return room;
    }
}
