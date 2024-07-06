import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedStackTest {
    LinkedStack sut;

    @BeforeEach
    public void setLinkedStack() {
        sut = new LinkedStack();
    }

    @AfterEach
    public void tearDown() {
        sut = null;
    }

    @Test
    public void testPushSize() {
        //
        int a = 5;
        int b = 1;
        //
        sut.push(a);
        //
        Assertions.assertEquals(b, sut.getSize());
    }

    @Test
    public void testIsEmpty() {
        //
        boolean q;
        //
        q = sut.isEmpty();
        //
        Assertions.assertTrue(q);
    }

    @Test
    public void testToString_EMPTY() {
        //
        String a = "EMPTY";
        String b;
        //
        b = sut.toString();
        //
        Assertions.assertEquals(a, b);
    }

    @Test
    public void testToString() {
        //
        String a = "5 -> 10";
        String q;
        int b = 5;
        int c = 10;
        sut.push(c);
        sut.push(b);
        //
        q = sut.toString();
        //
        Assertions.assertEquals(a, q);
    }
}
