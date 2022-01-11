package app.interfaces;

import java.util.ArrayList;

public interface ITypeService extends IEntity {
    ArrayList<IType> getAll();
    IType create(String name, int places, String[] services);
    IType change(int id, String name, int places, String[] services);
}
