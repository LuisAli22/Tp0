

public class MyQueue implements Queue {
    Node last;
    State state;
    MyQueue(){state= new Empty_State(this);}
    @Override
    public boolean isEmpty() {return (last==null);}
    @Override
    public int size() {return state.size(this);}
    @Override
    public void add(Object item) {state.add(this,item);}
    @Override
    public void remove()throws AssertionError{state.remove(this);}
    @Override
    public Object top() throws  AssertionError {return state.top(this);}
    public void setlast(Node last){this.last=last;}
    public Node getlast(){return last;}
    public void changestate(State state) {this.state=state;}
}
