/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Stake;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void pushStack(){
        Stack stack= new Stack();
        stack.push("A");
        assertEquals(
                "A",
                "A",
                stack.toString()
        );
    }
    @Test
    public void testPushMultipleValueStack() {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("D");
        stack.push("H");
        stack.push("A");
        stack.push("M");

        assertEquals(
                "ADHAM",
                "ADHAM",
                stack.toString()
        );
    }
    @Test
    void testPopStack() {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("D");
        stack.push("H");

        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(true,stack.isEmpty());
    }
    @Test void testpeekStack() {
        Stack stack=new Stack();
        stack.push("A");
        stack.push("B");
        String res="B";
        assertEquals(res,stack.peek());
    }
    @Test void testenqueueOnevalue() {
        Queue<C> queue=new Queue<C>();
        queue.enqueue("a");
        String front="a";
        assertEquals(false,queue.isEmpty());
        assertEquals(front,queue.front.data);

    }
    @Test void testenqueueMultiplevalue() {
        Queue<C> queue=new Queue<C>();
        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        String resfront="a";
        String resrear="c";
        assertEquals(false,queue.isEmpty());
        assertEquals(resfront,queue.front.data);
        assertEquals(resrear,queue.rear.data);
    }


    @Test void testpeekQueue() {
        Queue<C> queue=new Queue<C>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.dequeue();
        String res="B";
        assertEquals(res,queue.peek());
    }
    @Test
    public void testIsEmptyStack() {
        Stack stack = new Stack();
        assertEquals(true,stack.isEmpty());

    }
    @Test void stackQueuePseudo() {
        Pseudo test = new Pseudo();


        test.enqueue("A");
        test.enqueue("B");


        assertEquals("A", test.dequeue());




    }
}
