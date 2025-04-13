public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(15);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        System.out.println("Size: " + list.size());
        System.out.println("Item at index 2: " + list.get(2));
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.remove(2);
        System.out.println(list.get(2));
    }
}