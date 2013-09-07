
public interface Queue {
    public boolean isEmpty();
    public int size();
    public void add(Object item);
    public Object top() throws AssertionError;
    public void remove() throws  AssertionError;
}
