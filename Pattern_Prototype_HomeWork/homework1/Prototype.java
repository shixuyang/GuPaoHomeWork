package prototype;

import java.util.ArrayList;

public class Prototype implements Cloneable{
    public String name;
    public ArrayList<CloneTarget> list;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
