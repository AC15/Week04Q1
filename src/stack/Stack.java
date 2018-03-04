package stack;

public interface Stack<T> {
    
    boolean isEmpty();
    
    void pop() throws StackUnderflowException;
    
    void push(T item);
    
    T top() throws StackUnderflowException;
    
    @Override
    String toString();
}
