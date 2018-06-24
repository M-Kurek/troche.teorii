package pl.mk.pattern.command;

import org.junit.Test;

import static org.junit.Assert.*;

public class RefactoringWithCommandTest {

    @Test(expected = NullPointerException.class)
    public void testUnknownBreaks() {
        RefactoringWithCommand refCom = new RefactoringWithCommand();
        //works, OK : refCom.getHandlers().get("LOG").execute(null);
        refCom.getHandlers().get("LOG_NEVER").execute(null);

        fail("not allowed here");
    }

}