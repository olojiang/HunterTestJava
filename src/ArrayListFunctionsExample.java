import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 注：Vector：类似于 ArrayList，但线程安全。
public class ArrayListFunctionsExample {
    public static void main(String[] args) {
        // 1. add(E e) - 在列表末尾添加一个元素
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        System.out.println("After add: " + list); // 输出: After add: [Java]

        // 2. add(int index, E element) - 在指定位置插入元素
        list.add(1, "Python");
        System.out.println("After add at index 1: " + list); // 输出: After add at index 1: [Java, Python]

        // 3. get(int index) - 返回指定位置的元素
        String firstElement = list.get(0);
        System.out.println("Get element at index 0: " + firstElement); // 输出: Get element at index 0: Java

        // 4. set(int index, E element) - 更改指定位置的元素
        list.set(1, "C++");
        System.out.println("After set at index 1: " + list); // 输出: After set at index 1: [Java, C++]

        // 5. remove(int index) - 删除指定位置的元素
        list.remove(1);
        System.out.println("After remove at index 1: " + list); // 输出: After remove at index 1: [Java]

        // 6. remove(Object o) - 删除列表中首次出现的指定元素
        list.add("Python");
        list.add("Java");
        list.remove("Java");
        System.out.println("After remove 'Java': " + list); // 输出: After remove 'Java': [Python, Java]

        // 7. clear() - 清空列表
        list.clear();
        System.out.println("After clear: " + list); // 输出: After clear: []

        // 8. size() - 返回列表的元素个数
        list.add("Java");
        list.add("Python");
        int size = list.size();
        System.out.println("Size: " + size); // 输出: Size: 2

        // 9. isEmpty() - 判断列表是否为空
        boolean isEmpty = list.isEmpty();
        System.out.println("Is empty: " + isEmpty); // 输出: Is empty: false

        // 10. contains(Object o) - 判断列表是否包含指定的元素
        boolean contains = list.contains("Java");
        System.out.println("Contains 'Java': " + contains); // 输出: Contains 'Java': true

        // 11. indexOf(Object o) - 返回指定元素在列表中首次出现的位置
        int indexOf = list.indexOf("Python");
        System.out.println("Index of 'Python': " + indexOf); // 输出: Index of 'Python': 1

        // 12. lastIndexOf(Object o) - 返回指定元素在列表中最后一次出现的位置
        list.add("Java");
        int lastIndexOf = list.lastIndexOf("Java");
        System.out.println("Last index of 'Java': " + lastIndexOf); // 输出: Last index of 'Java': 2

        // 13. toArray() - 返回包含列表中所有元素的数组
        Object[] array = list.toArray();
        System.out.println("To array: " + Arrays.toString(array)); // 输出: To array: [Java, Python, Java]

        // 14. toArray(T[] a) - 返回包含列表中所有元素的数组，指定类型
        String[] stringArray = list.toArray(new String[0]);
        System.out.println("To array with type: " + Arrays.toString(stringArray)); // 输出: To array with type: [Java, Python, Java]

        // 15. addAll(Collection<? extends E> c) - 将指定集合中的所有元素添加到列表
        ArrayList<String> anotherList = new ArrayList<>(Arrays.asList("C#", "Ruby"));
        list.addAll(anotherList);
        System.out.println("After addAll: " + list); // 输出: After addAll: [Java, Python, Java, C#, Ruby]

        // 16. addAll(int index, Collection<? extends E> c) - 在指定位置插入指定集合中的所有元素
        list.addAll(1, anotherList);
        System.out.println("After addAll at index 1: " + list); // 输出: After addAll at index 1: [Java, C#, Ruby, Python, Java, C#, Ruby]

        // 17. removeAll(Collection<?> c) - 删除列表中与指定集合相同的所有元素
        list.removeAll(anotherList);
        System.out.println("After removeAll: " + list); // 输出: After removeAll: [Java, Python, Java]

        // 18. retainAll(Collection<?> c) - 仅保留列表中与指定集合相同的元素
        list.retainAll(Arrays.asList("Java"));
        System.out.println("After retainAll: " + list); // 输出: After retainAll: [Java, Java]

        // 19. subList(int fromIndex, int toIndex) - 返回列表中指定范围的子列表
        list.add("Python");
        list.add("C++");
        ArrayList<String> subList = new ArrayList<>(list.subList(1, 3));
        System.out.println("Sublist: " + subList); // 输出: Sublist: [Java, Python]

        // 20. clone() - 返回列表的浅拷贝
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned list: " + clonedList); // 输出: Cloned list: [Java, Java, Python, C++]

        // 21. ensureCapacity(int minCapacity) - 增加列表的容量，以确保它至少可以容纳指定数量的元素
        list.ensureCapacity(20);
        System.out.println("Capacity ensured to 20");

        // 22. trimToSize() - 将列表的容量调整为列表的当前大小
        list.trimToSize();
        System.out.println("Capacity trimmed to size");

        // 以下是使用 Stream API 的更多示例：

        // 23. forEach() - 遍历列表
        System.out.println("Using forEach:");
        list.forEach(System.out::println); // 输出: Java Java Python C++

        // 24. filter() - 过滤列表中的元素
        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println("Filtered list (elements starting with 'J'): " + filteredList); // 输出: [Java, Java]

        // 25. map() - 对列表中的每个元素应用函数
        List<String> upperCaseList = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mapped list (to upper case): " + upperCaseList); // 输出: [JAVA, JAVA, PYTHON, C++]

        // 26. sorted() - 对列表进行排序
        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList); // 输出: [C++, Java, Java, Python]

        // 27. distinct() - 去重
        list.add("Java");
        List<String> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct list: " + distinctList); // 输出: [Java, Python, C++]

        // 28. count() - 统计元素数量
        long count = list.stream().count();
        System.out.println("Element count: " + count); // 输出: 5

        // 29. anyMatch() - 判断是否有任意一个元素满足条件
        boolean anyMatch = list.stream().anyMatch(s -> s.equals("Python"));
        System.out.println("Any match 'Python': " + anyMatch); // 输出: true

        // 30. allMatch() - 判断是否所有元素都满足条件
        boolean allMatch = list.stream().allMatch(s -> s.length() > 1);
        System.out.println("All match (length > 1): " + allMatch); // 输出: true

        // 31. noneMatch() - 判断是否没有任何元素满足条件
        boolean noneMatch = list.stream().noneMatch(s -> s.equals("Ruby"));
        System.out.println("None match 'Ruby': " + noneMatch); // 输出: true

        // 32. collect() - 收集结果到一个新的列表
        List<String> collectedList = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.toList());
        System.out.println("Collected list (length > 3): " + collectedList); // 输出: [Java, Python, Java, C++]

        // 33. reduce() - 归约操作
        String concatenatedString = list.stream()
                .reduce("", (partialString, elem) -> partialString + elem + " ");
        System.out.println("Concatenated string: " + concatenatedString.trim()); // 输出: Java Java Python C++ Java

        // 34. findFirst() - 查找第一个满足条件的元素
        String firstJElement = list.stream()
                .filter(s -> s.startsWith("J"))
                .findFirst()
                .orElse("No element found");
        System.out.println("First element starting with 'J': " + firstJElement); // 输出: Java
    }
}
