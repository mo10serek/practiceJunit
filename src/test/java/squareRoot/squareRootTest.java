package squareRoot;

import junit.framework.TestCase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Types;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squareRootTest extends TestCase {

    squareRoot squareRoot = new squareRoot();

    @Test
    public void testSquareRoot() {
        assertEquals(squareRoot.squareRoot(4), 2.0);
    }

    @Test
    public void CheckifTypeIsDouble(){
        assertTrue(Double.class.isInstance(squareRoot.squareRoot(16)));
    }
}