package pl.mk.testing;

import java.util.*;

/** checking awaitility */
public class AwaitService {
    private volatile int markOne;
    private List<Integer> innerList = new ArrayList<>();

    public void make() {
        increment();
        innerList.add(markOne);
    }

    public int increment() {
        return ++markOne;
    }

    public List<Integer> getInnerList() {
        return new ArrayList<Integer>(innerList) ;
    }

    public void init() {
        innerList.clear();
        this.markOne = innerList.size();
    }
}
