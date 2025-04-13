import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[5];
        size = 0;
    }

    public void add(T item){
        if(size == elements.length){
            increaseBuffer();
        }
        elements[size++] = item; //upcasting
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

    private void increaseBuffer() {
        Object[] newElements = new Object[size*2];
        for(int i = 0; i < elements.length; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        checkIndex(index);
        return (T) elements[index];  //downcasting
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public void clear(){
        elements = new Object[5];
        size = 0;
    }

    public void remove(int index){
        checkIndex(index);
        for(int i = index; i < size - 1; i++){
            elements[i] = elements[i+1];
        }
        size--;
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
    public Iterator<T> iterator() {
        return null;
    }
}