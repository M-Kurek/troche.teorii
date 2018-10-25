package pl.mk.testing;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.concurrent.Callable;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AwaitServiceTest {
    private static final int WANTED_NUMBER_OF_INVOCATIONS = 4;
    @Spy
    private AwaitService service;

    @Test
    public void testAwaitWork() {
        await().until(srvMade());
        verify(service, times(WANTED_NUMBER_OF_INVOCATIONS)).make();
    }

    private Callable<Boolean> srvMade() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                service.make();
                return service.getInnerList().size() >= WANTED_NUMBER_OF_INVOCATIONS;
            }
        };
    }

    @Test
    public void testAwaitCounted() {
        await().until(incrementSrv());
        verify(service, times(WANTED_NUMBER_OF_INVOCATIONS)).increment();
    }

    private Callable<Boolean> incrementSrv() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                return service.increment() >= WANTED_NUMBER_OF_INVOCATIONS;
            }
        };
    }

    @After
    public void cleanSrv() {
        service.init();
    }
}