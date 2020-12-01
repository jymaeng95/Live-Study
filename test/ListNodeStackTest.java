import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeStackTest {
    private ListNodeStack stack;
    private static final int[] PUSH_DATA = {1,3,5,7,9};
    @BeforeEach
    void setUp() {
        stack = new ListNodeStack();
    }

    @Test
    void push() {
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        ListNode node = stack.node;

        int i=0;
        while(node != null) {
            Assertions.assertEquals(PUSH_DATA[i++],node.data);
            node = node.next;
        }
    }

    @Test
    void pop() {
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);

        Assertions.assertEquals(9,stack.pop());
        Assertions.assertEquals(7,stack.pop());
        Assertions.assertEquals(5,stack.pop());
        Assertions.assertEquals(3,stack.pop());
        Assertions.assertEquals(1,stack.pop());

    }
}