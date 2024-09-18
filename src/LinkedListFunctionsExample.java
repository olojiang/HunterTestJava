import java.util.LinkedList;
import java.util.ListIterator;

// 注：LinkedList 的插入和删除时间效率，显然比 ArrayList，Array 好很多，所以偶尔会考到
// 注：LinkedList 因为可以左右插入，也可以左右遍历，所以，作为双向队列也没有问题的
// 比起常用数据类型，也是算法中，中等 ~ 难的题目常用的数据结构
public class LinkedListFunctionsExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 1. add(E e) - 在链表末尾添加元素
        list.add("Java");
        list.add("Python");
        list.add("C++");
        System.out.println("List after add: " + list); // 输出: List after add: [Java, Python, C++]

        // 2. add(int index, E element) - 在指定位置插入元素
        list.add(1, "JavaScript");
        System.out.println("List after add at index 1: " + list); // 输出: List after add at index 1: [Java, JavaScript, Python, C++]

        // 3. addFirst(E e) - 在链表的开头添加元素
        list.addFirst("Go");
        System.out.println("List after addFirst: " + list); // 输出: List after addFirst: [Go, Java, JavaScript, Python, C++]

        // 4. addLast(E e) - 在链表的末尾添加元素
        list.addLast("Ruby");
        System.out.println("List after addLast: " + list); // 输出: List after addLast: [Go, Java, JavaScript, Python, C++, Ruby]

        // 5. get(int index) - 获取指定位置的元素
        String elementAtIndex2 = list.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2); // 输出: Element at index 2: JavaScript

        // 6. getFirst() - 获取链表的第一个元素
        String firstElement = list.getFirst();
        System.out.println("First element: " + firstElement); // 输出: First element: Go

        // 7. getLast() - 获取链表的最后一个元素
        String lastElement = list.getLast();
        System.out.println("Last element: " + lastElement); // 输出: Last element: Ruby

        // 8. remove(int index) - 移除指定位置的元素
        String removedElement = list.remove(3);
        System.out.println("Removed element at index 3: " + removedElement); // 输出: Removed element at index 3: Python
        System.out.println("List after remove at index 3: " + list); // 输出: List after remove at index 3: [Go, Java, JavaScript, C++, Ruby]

        // 9. remove(Object o) - 移除指定的元素
        boolean isRemoved = list.remove("Java");
        System.out.println("Is 'Java' removed: " + isRemoved); // 输出: Is 'Java' removed: true
        System.out.println("List after remove 'Java': " + list); // 输出: List after remove 'Java': [Go, JavaScript, C++, Ruby]

        // 10. removeFirst() - 移除第一个元素
        String removedFirst = list.removeFirst();
        System.out.println("Removed first element: " + removedFirst); // 输出: Removed first element: Go
        System.out.println("List after removeFirst: " + list); // 输出: List after removeFirst: [JavaScript, C++, Ruby]

        // 11. removeLast() - 移除最后一个元素
        String removedLast = list.removeLast();
        System.out.println("Removed last element: " + removedLast); // 输出: Removed last element: Ruby
        System.out.println("List after removeLast: " + list); // 输出: List after removeLast: [JavaScript, C++]

        // 12. set(int index, E element) - 替换指定位置的元素
        list.set(1, "Swift");
        System.out.println("List after set at index 1: " + list); // 输出: List after set at index 1: [JavaScript, Swift]

        // 13. contains(Object o) - 判断链表是否包含指定元素
        boolean containsJavaScript = list.contains("JavaScript");
        System.out.println("List contains 'JavaScript': " + containsJavaScript); // 输出: List contains 'JavaScript': true

        // 14. size() - 获取链表的大小
        int size = list.size();
        System.out.println("Size of the list: " + size); // 输出: Size of the list: 2

        // 15. clear() - 清空链表
        list.clear();
        System.out.println("List after clear: " + list); // 输出: List after clear: []

        // 16. isEmpty() - 判断链表是否为空
        boolean isEmpty = list.isEmpty();
        System.out.println("Is list empty: " + isEmpty); // 输出: Is list empty: true

        // 17. addAll(Collection<? extends E> c) - 添加集合中的所有元素
        LinkedList<String> anotherList = new LinkedList<>();
        anotherList.add("HTML");
        anotherList.add("CSS");
        anotherList.add("JavaScript");
        list.addAll(anotherList);
        System.out.println("List after addAll: " + list); // 输出: List after addAll: [HTML, CSS, JavaScript]

        // 18. addAll(int index, Collection<? extends E> c) - 在指定位置添加集合中的所有元素
        LinkedList<String> additionalList = new LinkedList<>();
        additionalList.add("SQL");
        additionalList.add("NoSQL");
        list.addAll(1, additionalList);
        System.out.println("List after addAll at index 1: " + list); // 输出: List after addAll at index 1: [HTML, SQL, NoSQL, CSS, JavaScript]

        // 19. removeFirstOccurrence(Object o) - 移除第一次出现的指定元素
        list.add("SQL");
        list.removeFirstOccurrence("SQL");
        System.out.println("List after removeFirstOccurrence of 'SQL': " + list); // 输出: List after removeFirstOccurrence of 'SQL': [HTML, NoSQL, CSS, JavaScript, SQL]

        // 20. removeLastOccurrence(Object o) - 移除最后一次出现的指定元素
        list.removeLastOccurrence("SQL");
        System.out.println("List after removeLastOccurrence of 'SQL': " + list); // 输出: List after removeLastOccurrence of 'SQL': [HTML, NoSQL, CSS, JavaScript]

        // 21. iterator() - 获取链表的迭代器
        ListIterator<String> iterator = list.listIterator();
        System.out.print("List elements using iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println(); // 输出: List elements using iterator: HTML NoSQL CSS JavaScript

        // 22. descendingIterator() - 获取链表的逆序迭代器
        ListIterator<String> descendingIterator = list.listIterator(list.size());
        System.out.print("List elements using descendingIterator: ");
        while (descendingIterator.hasPrevious()) {
            System.out.print(descendingIterator.previous() + " ");
        }
        System.out.println(); // 输出: List elements using descendingIterator: JavaScript CSS NoSQL HTML
    }
}
