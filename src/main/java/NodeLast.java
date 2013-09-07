
public class NodeLast extends Node {
    public NodeLast(Object data) {super(data);}
    @Override
    public int size() {return 1;}
    @Override
    public NodeBody insert(Object item,Object topitem){ return new NodeBody(new NodeLast(item),topitem);}
}
