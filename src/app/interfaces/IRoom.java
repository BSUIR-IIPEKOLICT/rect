package app.interfaces;

public interface IRoom {
    boolean isFree();
    void setIsFree(boolean isFree);
    int typeId();
    void setTypeId(int typeId);
    int buildingId();
    void setBuildingId(int buildingId);
}
