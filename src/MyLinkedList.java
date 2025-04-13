import java.util.Iterator;

public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
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
        size++;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        MyNode<T> current = getNode(index);
        current.data = item;
    }

    @Override
    public void add(int index, T item) {
        checkIndex(index);
        if(index == 0){
            addFirst(item);
        }
        else if(index == size){
            addLast(item);
        }
        else {
            MyNode<T> current = getNode(index);
            MyNode<T> newNode = new MyNode<>(item);
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    @Override
    public void addFirst(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        add(item);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        MyNode<T> toRemove = getNode(index);
        if (toRemove.prev != null) {
            toRemove.prev.next = toRemove.next;
        }
        else {
            head = toRemove.next;
        }

        if (toRemove.next != null) {
            toRemove.next.prev = toRemove.prev;
        }
        else {
            tail = toRemove.prev;
        }
        size--;
    }

    @Override
    public void removeFirst() {
        if(head == null) return;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;
        size--;
    }

    @Override
    public void removeLast() {
        if (head == null) return;
        tail = tail.prev;
        if (tail != null) tail.next = null;
        else head = null;
        size--;
    }

    @Override
    public void sort() {
        if (size < 2) return;
        for (MyNode<T> i = head; i != null; i = i.next) {
            for (MyNode<T> j = i.next; j != null; j = j.next) {
                if (i.data.compareTo(j.data) > 0) {
                    T temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
    }

    @Override
    public int indexOf(Object object) {
        int index = 0;
        for (MyNode<T> current = head; current != null; current = current.next) {
            if (current.data.equals(object))
                return index;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int index = size - 1;
        for (MyNode<T> current = tail; current != null; current = current.prev) {
            if (current.data.equals(object)) return index;
            index--;
        }
        return -1;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (MyNode<T> current = head; current != null; current = current.next) {
            array[i++] = current.data;
        }
        return array;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
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
        if (head == null) return null;
        return head.data;
    }

    @Override
    public T getLast() {
        if (tail == null) return null;
        return tail.data;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            MyNode<T> current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T result = current.data;
                current = current.next;
                return result;
            }
        };
    }

    private MyNode<T> getNode(int index){
        MyNode<T> current;
        if (index < size / 2) {
            current = head;
            for(int i = 0; i < index; i++){
                current = current.next;
            }
        }
        else {
            current = tail;
            for (int i = size - 1; i > index; i--){
                current = current.prev;
            }
        }
        return current;
    }

    private static class MyNode<T> {
        T data;
        MyNode<T> next;
        MyNode<T> prev;

        public MyNode(T data){
            this.data = data;
        }
    }
}