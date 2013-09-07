
public abstract class Node {
    private Object data;
    public Node(Object data){this.data=data;}
    public Object getdata(){return data;}
    public abstract int size();
    public abstract NodeBody insert(Object item,Object topitem);
    public Node remove() {return this;}

}
