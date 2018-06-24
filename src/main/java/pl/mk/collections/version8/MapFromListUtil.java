package pl.mk.collections.version8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapFromListUtil {

    /**
     * similar to https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html
     * @param source
     * @return
     */
    public static Map<Number, IdObject> mapListWithId(List<IdObject> source) {
        return source.stream().collect(Collectors.toMap(IdObject::getID,
                Function.identity()));
    }
}
