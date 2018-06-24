package pl.mk.pattern.factory;

public class ExampleFactoryPattern {

    public static CrunchifyCompany createInstanceByName(String name, String... params) {
        if ("Ebay".equals(name)) {
            return new CrunchifyEbay();
        } else if ("Google".equals(name)) {
            return new CrunchifyGgle();
        } else {
            return null;
        }
    }
}
