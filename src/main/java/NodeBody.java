
public class NodeBody extends NodeDecorator {
    Node node;
    public NodeBody(Node node,Object item){
        super(item);
        this.node=node;
    }
    @Override
    public int size() {return 1+node.size();}
    @Override
    public NodeBody insert(Object item,Object topitem){ return new NodeBody(node.insert(item,node.getdata()),topitem);}
    @Override
    public Node remove() {return node;}
}
