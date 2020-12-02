import junit.framework.TestCase;

public class TestNumberToString extends TestCase {
    public void testConvert1ToString(){
        NumberToString numberToString = new NumberToString();
        assertEquals("One",numberToString.getString(1));
    }

    public void testConvert2ToString(){
        NumberToString numberToString = new NumberToString();
        assertEquals("Two",numberToString.getString(2));
    }

    public void testConvert3ToString(){
        NumberToString numberToString = new NumberToString();
        assertEquals("Three",numberToString.getString(3));
    }
}
