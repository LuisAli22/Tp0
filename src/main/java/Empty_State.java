
public class Empty_State extends State {
    Empty_State(MyQueue queue){queue.setlast(null);}
    @Override
    public void add(MyQueue queue, Object item)throws AssertionError{
        queue.setlast(new NodeLast(item));
        queue.changestate(new NoEmpty_state());
    }
}
