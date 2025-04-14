public class MyQueue<T extends Comparable<T>>{
    private MyLinkedList<T> list;

    public MyQueue(){
        list = new MyLinkedList<>();
    }

    public void enqueue(T item){
        list.add(item);
    }

    public T dequeue(){
        if (isEmpty()) return null;
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    public T peek(){
        if (isEmpty()) return null;
        return list.getFirst();
    }


    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
