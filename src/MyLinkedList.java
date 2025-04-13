import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;

    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }
    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    @Override
    public void set(int index, T item) {

    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }


    private class MyNode<T> {
        T data;
        MyNode<T> next;
        MyNode<T> prev;

        public MyNode(T data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
}