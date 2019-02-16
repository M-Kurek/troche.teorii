package pl.mk.algo.checkgson;

public class StarId extends TheId {
    private Integer aValue;

    private Integer bValue;
    public StarId(int one, int two) {
        aValue = one;
        bValue = two;
    }
    public Integer getaValue() {
        return aValue;
    }

    public Integer getbValue() {
        return bValue;
    }
}
