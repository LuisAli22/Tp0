
public abstract class State {

    public void add(MyQueue queue, Object item)throws  AssertionError{
        throw new AssertionError("No se puede agregar elemento");
    }
    public void remove(MyQueue queue) throws AssertionError {
        throw new AssertionError("No se puede eliminar un elemento.");
    }
    public Object top(MyQueue queue)throws AssertionError {
        throw new AssertionError("No se puede mostrar el primer elemento.");
    }
    public int size(MyQueue queue){return 0;}
}
