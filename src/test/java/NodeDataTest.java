import org.junit.Test;

import static org.junit.Assert.*;

public class NodeDataTest {
    @Test
    public void singlenodetest(){
        NodeLast nlast= new NodeLast(6.0);
        assertEquals(6.0, (Double) nlast.getdata(),0);
    }
    @Test
    public void twonodetest(){
        NodeLast nlast= new NodeLast(6.0);
        NodeBody nbody=nlast.insert(8.0,6.0);
        assertEquals(6.0, (Double) nbody.getdata(),0);
    }
    @Test
    public void threenodetest(){
        NodeLast nlast= new NodeLast(6.0);
        NodeBody nbody=nlast.insert(8.0,6.0);
        nbody= nbody.insert(15.0,nbody.getdata());
        assertEquals(6.0, (Double) nbody.getdata(),0);
    }
    @Test
    public void removefromtwonodetest(){
        NodeLast nlast= new NodeLast(6.0);
        NodeBody nbody=nlast.insert(8.0,6.0);
        Node node=nbody.remove();
        assertEquals(8.0, (Double) node.getdata(),0);
    }
    @Test
    public void removefromthreenodetest(){
        NodeLast nlast= new NodeLast(6.0);
        NodeBody nbody=nlast.insert(8.0,6.0);
        nbody= nbody.insert(15.0,nbody.getdata());
        Node node=nbody.remove();
        node=node.remove();
        assertEquals(15.0, (Double) node.getdata(),0);
    }
}
