package pl.mk.collections;

import java.util.*;

public class AgainstAbstract {

    private AbstractList<String> list = new ArrayList<String>();

    void treatAbstractAsInterface(String newItem) {
        this.list.add(newItem);
    }


    public AbstractList<String> getList() {
        return list;
    }

}
