package pl.mk.algo.checkgson;

import java.util.ArrayList;
import java.util.List;

public class AbstractStructureWrapper {

    private List<StarId> sPart = new ArrayList<>();

    private List<ZenId> zPart = new ArrayList<>();

    public AbstractStructureWrapper(
            List<StarId> sItems, List<ZenId> zItems) {
        this.sPart = sItems;
        this.zPart = zItems;
    }

    public AbstractStructureWrapper(List<TheId> sItems) {
        for (TheId one : sItems) {
            if (one instanceof StarId) {
                sPart.add((StarId) one);
            } else {
                zPart.add((ZenId) one);
            }
        }
    }
    public List<StarId> getStars() {
        return sPart;
    }

    public List<ZenId> getZens() {
        return zPart;
    }
}
