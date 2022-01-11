package app.database;

import java.util.ArrayList;

import app.interfaces.IBuilding;
import app.interfaces.IReview;
import app.interfaces.IRoom;
import app.interfaces.IType;

public class DB {
    public static ArrayList<IReview> reviews = new ArrayList<>();
    public static ArrayList<IBuilding> buildings = new ArrayList<>();
    public static ArrayList<IType> types = new ArrayList<>();
    public static ArrayList<IRoom> rooms = new ArrayList<>();
}
