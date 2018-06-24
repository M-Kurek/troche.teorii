package pl.mk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void testClassSingleton() throws Exception {
        Object instance = TheSingleton.getInstance();
        assertEquals(instance.hashCode(), TheSingleton.getInstance().hashCode());
        assertTrue(instance.equals(TheSingleton.getInstance()));
        assertTrue(instance == TheSingleton.getInstance());
    }
    @Test
    public void testEnumSingleton() {
        EnumSingleton instance = EnumSingleton.getInstance();
        assertEquals(instance.hashCode(), EnumSingleton.getInstance().hashCode());
        assertTrue(instance.equals(EnumSingleton.getInstance()));
        assertTrue(instance == EnumSingleton.getInstance());
    }

/*
i problem..
seek: Java se testing cdi / weld

toto nie wola     @PostConstruct

    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration(locations = "classpath:test-context-xml.xml")
//  class annotations

//file
<?xml version="1.0" encoding="utf-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config />

</beans>

//rest
    @Before
    public void init() {
        instance = AnnotatedSingleton.getInstance();
        instance.start();

    }

//i dopiero test

    @Test
    public void testJEESingleton() {
        assertEquals(instance.hashCode(), AnnotatedSingleton.getInstance().hashCode());
        assertTrue(instance.equals(AnnotatedSingleton.getInstance()));
        assertTrue(instance == AnnotatedSingleton.getInstance());
    }
*/
}