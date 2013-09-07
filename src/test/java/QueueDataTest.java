import org.junit.Test;

import static org.junit.Assert.*;


public class QueueDataTest {

    @Test
    public void sizeonetest(){
        Queue queue=new MyQueue();
        queue.add(5.0);
        assertEquals(5.0, (Double) queue.top(), 0);
    }
    @Test
    public void sizetwotest(){
        Queue queue= new MyQueue();
        queue.add(6.0);
        queue.add(8.0);
        assertEquals(6, (Double) queue.top(), 0);
    }
    @Test
    public void sizethreetest(){
        Queue queue= new MyQueue();
        queue.add(6.0);
        queue.add(8.0);
        queue.add(15.0);
        assertEquals(6, (Double) queue.top(), 0);
    }
    @Test
    public void multipleelementsizetest(){
        Queue queue= new MyQueue();
        queue.add(6.0);
        queue.add(8.0);
        queue.add(15.0);
        queue.remove();
        assertEquals(8.0, (Double) queue.top(), 0);
    }
    @Test
    public void removemultipleelementtest(){
        MyQueue queue= new MyQueue();
        queue.add(6.0);
        queue.add(8.0);
        queue.add(15.0);
        queue.remove();
        queue.remove();
        assertEquals(15.0, (Double) queue.top(),0);
    }
}
