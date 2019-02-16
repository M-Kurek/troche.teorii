package pl.mk.algo.checkgson;

import com.google.gson.Gson;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AbstractStructureWrapperTest {

    @Test
    public void whenStarAdded_thenStarsJsonized() throws Exception {
        //given
        List<TheId> list = new ArrayList<>();
        list.add(new StarId(1, 2));
        list.add(new ZenId(30));
        AbstractStructureWrapper cut = new AbstractStructureWrapper(list);
        final String json = new Gson().toJson(cut);
        //when
        final AbstractStructureWrapper re = new Gson().fromJson(json, AbstractStructureWrapper.class);
        //then
        final List<StarId> stars = re.getStars();
        assertEquals(1, stars.iterator().next().getaValue().intValue());
        assertEquals(2, stars.iterator().next().getbValue().intValue());
        assertEquals(30, re.getZens().iterator().next().getA().intValue());
    }

}