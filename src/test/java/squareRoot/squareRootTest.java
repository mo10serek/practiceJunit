package squareRoot;

import junit.framework.TestCase;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class squareRootTest extends TestCase {

    squareRoot squareRoot = new squareRoot();

    public void testSquareRoot() {
        assertEquals(squareRoot.squareRoot(4), 2.0);
    }
}