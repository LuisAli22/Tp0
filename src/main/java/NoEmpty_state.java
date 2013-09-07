
public class NoEmpty_state extends  State {
    private Node getNode(MyQueue queue){return queue.getlast();}
    private Object getData(MyQueue queue){return getNode(queue).getdata();}
    private  Node getlast(MyQueue queue){return queue.getlast();}
    private NodeBody insertnewitem(Object item, MyQueue queue){return getlast(queue).insert(item,queue.top());}
    @Override
    public void add(MyQueue queue, Object item)throws AssertionError{queue.setlast(insertnewitem(item,queue));}
    @Override
    public Object top(MyQueue queue) throws AssertionError {return getData(queue);}
    @Override
    public void remove(MyQueue queue) throws AssertionError {
        boolean is_last=(getlast(queue).size()==1);
        queue.setlast(getlast(queue).remove());
        if (is_last) queue.changestate(new Empty_State(queue));
    }
    @Override
    public int size(MyQueue queue){return getlast(queue).size();}
}
