
public abstract class NodeDecorator extends Node{
    protected NodeDecorator(Object data) {
        super(data);
    }
    public abstract Node remove();

}
