// BasicArrayFunctionsExample.java

import java.util.Arrays;

public class BasicArrayFunctionsExample {

    public static void main(String[] args) {
        // 1. Arrays.toString() - 将数组转换为字符串表示形式
        int[] intArray = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(intArray);
        System.out.println("Array as String: " + arrayString); // 输出: Array as String: [1, 2, 3, 4, 5]

        // 2. Arrays.sort() - 对数组进行排序
        int[] unsortedArray = {5, 3, 1, 4, 2};
        Arrays.sort(unsortedArray);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray)); // 输出: Sorted array: [1, 2, 3, 4, 5]

        // 3. Arrays.binarySearch() - 在排序数组中查找元素的索引
        int index = Arrays.binarySearch(unsortedArray, 3);
        System.out.println("Index of element 3: " + index); // 输出: Index of element 3: 2

        // 4. Arrays.fill() - 将数组的所有元素设置为指定值
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array: " + Arrays.toString(filledArray)); // 输出: Filled array: [7, 7, 7, 7, 7]

        // 5. Arrays.copyOf() - 复制数组到一个新数组
        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray)); // 输出: Copied array: [1, 2, 3, 4, 5]

        // 6. Arrays.equals() - 比较两个数组是否相等
        boolean arraysEqual = Arrays.equals(intArray, copiedArray);
        System.out.println("Arrays equal: " + arraysEqual); // 输出: Arrays equal: true

        // 7. Arrays.asList() - 将数组转换为列表
        String[] stringArray = {"Java", "Python", "C++"};
        java.util.List<String> stringList = Arrays.asList(stringArray);
        System.out.println("Array as List: " + stringList); // 输出: Array as List: [Java, Python, C++]

        // 8. Arrays.stream() - 创建一个数组流用于流操作
        int sum = Arrays.stream(intArray).sum();
        System.out.println("Sum of array elements: " + sum); // 输出: Sum of array elements: 15

        // 9. Arrays.setAll() - 使用生成的值设置数组的所有元素
        int[] setAllArray = new int[5];
        Arrays.setAll(setAllArray, i -> i * 2);
        System.out.println("SetAll array: " + Arrays.toString(setAllArray)); // 输出: SetAll array: [0, 2, 4, 6, 8]

        // 10. Arrays.parallelSort() - 并行排序数组
        int[] parallelUnsortedArray = {5, 3, 1, 4, 2};
        Arrays.parallelSort(parallelUnsortedArray);
        System.out.println("Parallel sorted array: " + Arrays.toString(parallelUnsortedArray)); // 输出: Parallel sorted array: [1, 2, 3, 4, 5]
    }
}
