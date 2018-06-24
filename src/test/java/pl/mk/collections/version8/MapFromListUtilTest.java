package pl.mk.collections.version8;

import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsSame;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MapFromListUtilTest {
    @Test
    public void mapListWithId() throws Exception {
        BetterIdObj idObj1 = createIdObj(1);
        List<IdObject> sourceList = new ArrayList(Arrays.asList(idObj1));
        Map<Number, IdObject> createdMap = MapFromListUtil.mapListWithId(sourceList);
        assertThat(createdMap.keySet().size(), Is.is(1));
        assertThat(createdMap.keySet(), Matchers.contains(new Integer(1)));

        IdObject object = createdMap.get(1);
        assertThat(object, IsSame.sameInstance(idObj1));
    }

    private BetterIdObj createIdObj(Integer id) {
        BetterIdObj betterIdObj = new BetterIdObj();
        betterIdObj.setID(id);
        return betterIdObj;
    }

    private class BetterIdObj extends IdObject {
    }
}