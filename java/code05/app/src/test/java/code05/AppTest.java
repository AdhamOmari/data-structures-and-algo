/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package code05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void includes() {
        Linkedlist list = new Linkedlist();
        assertEquals(3,3);
    }
    @Test void s () {
        Linkedlist list = new Linkedlist();
        assertEquals(4,4);
    }
    @Test
    void testInseart() {
        Linkedlist testInsert = new Linkedlist();
        testInsert.insert(4);
        testInsert.insert(6);
        assertEquals("{4}{6}NULL",testInsert.toString() );
    }
    @Test
    void testToString() {
        Linkedlist testToString = new Linkedlist();
        testToString.insert(4);
        testToString.insert(6);
        assertEquals("{4}{6}NULL", testToString.toString());
    }

    @Test void includesTest() {
        Linkedlist includesTest = new Linkedlist();
        includesTest.insert(10);
        assertEquals( true , includesTest.includes(10) );

    }

}
