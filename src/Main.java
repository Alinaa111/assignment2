public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<String> list2 = new MyLinkedList<>();

        System.out.println("Actions with MyArrayList, MyLinkedList:");
        list.add(88);
        list.add(33);
        list.add(15);
        list.add(47);
        list.add(30);
        list.add(14);

        list2.add("Alina");
        list2.add("Bekovna");
        list2.add("Berlin");
        list2.add("Astana luchshyi");

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i) + " ");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\n__________________\n\n");

        list.sort();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


        System.out.println("\n\n\nActions with MyStack:");
        MyStack<Integer> stack = new MyStack<>();

        stack.push(88);
        stack.push(33);
        stack.push(15);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println("\n\n\nActions with MyQueue:");
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Alina");
        queue.enqueue("Se-2405");
        queue.enqueue("quizzes");

        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

    }
}