import java.util.HashSet;

public class HashSetFunctionsExample {

    public static void main(String[] args) {
        // 1. add(E e) - 添加元素到 HashSet 中，如果元素已存在，则不添加，返回 false
        HashSet<String> set = new HashSet<>();
        boolean isAdded = set.add("Java");
        System.out.println("Added 'Java': " + isAdded); // 输出: Added 'Java': true

        isAdded = set.add("Java");
        System.out.println("Added 'Java' again: " + isAdded); // 输出: Added 'Java' again: false

        // 2. addAll(Collection<? extends E> c) - 添加指定集合中的所有元素到 HashSet 中
        HashSet<String> otherSet = new HashSet<>();
        otherSet.add("Python");
        otherSet.add("C++");
        set.addAll(otherSet);
        System.out.println("Added all elements from otherSet: " + set); // 输出: Added all elements from otherSet: [Java, Python, C++]

        // 3. clear() - 清空 HashSet 中的所有元素
        set.clear();
        System.out.println("Cleared set: " + set); // 输出: Cleared set: []

        // 4. contains(Object o) - 判断 HashSet 是否包含指定元素
        set.add("Java");
        boolean contains = set.contains("Java");
        System.out.println("Contains 'Java': " + contains); // 输出: Contains 'Java': true
        contains = set.contains("Python");
        System.out.println("Contains 'Python': " + contains); // 输出: Contains 'Python': false

        // 5. isEmpty() - 判断 HashSet 是否为空
        boolean isEmpty = set.isEmpty();
        System.out.println("Is set empty: " + isEmpty); // 输出: Is set empty: false

        set.clear();
        isEmpty = set.isEmpty();
        System.out.println("Is set empty after clear: " + isEmpty); // 输出: Is set empty after clear: true

        // 6. remove(Object o) - 从 HashSet 中移除指定元素，如果元素不存在，则不做任何操作
        set.add("Java");
        boolean isRemoved = set.remove("Java");
        System.out.println("Removed 'Java': " + isRemoved); // 输出: Removed 'Java': true

        isRemoved = set.remove("Python");
        System.out.println("Removed 'Python': " + isRemoved); // 输出: Removed 'Python': false

        // 7. size() - 返回 HashSet 中的元素个数
        set.add("Java");
        set.add("Python");
        int size = set.size();
        System.out.println("Size of set: " + size); // 输出: Size of set: 2

        // 8. iterator() - 返回 HashSet 的迭代器，用于遍历元素
        for (String element : set) {
            System.out.println("Element: " + element);
        }
        // 输出:
        // Element: Java
        // Element: Python

        // 9. toArray() - 返回包含 HashSet 中所有元素的数组
        Object[] array = set.toArray();
        System.out.println("Array from set: " + java.util.Arrays.toString(array)); // 输出: Array from set: [Java, Python]

        // 10. clone() - 创建并返回 HashSet 的浅复制
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet); // 输出: Cloned set: [Java, Python]

        // 11. retainAll(Collection<?> c) - 保留 HashSet 中那些也存在于指定集合中的元素
        HashSet<String> anotherSet = new HashSet<>();
        anotherSet.add("Java");
        anotherSet.add("C#");
        set.retainAll(anotherSet);
        System.out.println("Retained elements in set: " + set); // 输出: Retained elements in set: [Java]

        // 12. removeAll(Collection<?> c) - 移除 HashSet 中那些也存在于指定集合中的元素
        set.add("Python");
        set.removeAll(anotherSet);
        System.out.println("Set after removing elements of anotherSet: " + set); // 输出: Set after removing elements of anotherSet: [Python]
    }
}
