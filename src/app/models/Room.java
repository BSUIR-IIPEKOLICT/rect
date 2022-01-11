package app.models;

import java.text.MessageFormat;

import app.interfaces.IRoom;
import app.shared.Templates;

public class Room extends BaseModel implements IRoom {

    private boolean isFree;
    private int typeId;
    private int buildingId;

    private static int counter = 0;

    public Room(boolean isFree, int typeId, int buildingId) {
        super(counter);

        this.isFree = isFree;
        this.typeId = typeId;
        this.buildingId = buildingId;
    }

    @Override
    public boolean isFree() {
        return this.isFree;
    }

    @Override
    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    @Override
    public int typeId() {
        return this.typeId;
    }

    @Override
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public int buildingId() {
        return this.buildingId;
    }

    @Override
    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    @Override
    public String toString() {
        return MessageFormat.format(Templates.room, this.id, this.typeId, this.buildingId, this.isFree);
    }

    public boolean equals(Room obj) {
        return
            this.id() == obj.id() &&
            this.typeId() == obj.typeId() &&
            this.buildingId() == obj.buildingId() &&
            this.isFree() == obj.isFree();
    }
}
