import java.util.HashMap;
import java.util.Map;

// 注：Hashtable：类似于 HashMap，但线程安全
public class HashMapFunctionsExample {
    public static void main(String[] args) {
        // 1. put(K key, V value) - 将指定的值与此映射中的指定键相关联
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 1);
        System.out.println("After put: " + map); // 输出: After put: {Java=1}

        // 2. get(Object key) - 返回指定键所映射的值
        Integer value = map.get("Java");
        System.out.println("Get 'Java': " + value); // 输出: Get 'Java': 1

        // 3. remove(Object key) - 如果存在，移除并返回指定键所映射的值
        Integer removedValue = map.remove("Java");
        System.out.println("After remove 'Java': " + map); // 输出: After remove 'Java': {}

        // 4. size() - 返回此映射中的键-值映射关系数
        map.put("Python", 2);
        map.put("C++", 3);
        int size = map.size();
        System.out.println("Size: " + size); // 输出: Size: 2

        // 5. isEmpty() - 如果此映射不包含键-值映射关系，则返回 true
        boolean isEmpty = map.isEmpty();
        System.out.println("Is empty: " + isEmpty); // 输出: Is empty: false

        // 6. containsKey(Object key) - 如果此映射包含指定键的映射关系，则返回 true
        boolean containsKey = map.containsKey("Python");
        System.out.println("Contains key 'Python': " + containsKey); // 输出: Contains key 'Python': true

        // 7. containsValue(Object value) - 如果此映射为指定值映射一个或多个键，则返回 true
        boolean containsValue = map.containsValue(2);
        System.out.println("Contains value 2: " + containsValue); // 输出: Contains value 2: true

        // 8. putAll(Map<? extends K, ? extends V> m) - 将指定映射的所有映射关系复制到此映射中
        HashMap<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("JavaScript", 4);
        anotherMap.put("Ruby", 5);
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map); // 输出: After putAll: {Python=2, C++=3, JavaScript=4, Ruby=5}

        // 9. clear() - 从此映射中移除所有映射关系
        map.clear();
        System.out.println("After clear: " + map); // 输出: After clear: {}

        // 10. keySet() - 返回此映射中包含的键的 Set 视图
        map.put("Go", 6);
        map.put("Swift", 7);
        System.out.println("Key set: " + map.keySet()); // 输出: Key set: [Go, Swift]

        // 11. values() - 返回此映射中包含的值的 Collection 视图
        System.out.println("Values: " + map.values()); // 输出: Values: [6, 7]

        // 12. entrySet() - 返回此映射中包含的映射关系的 Set 视图
        System.out.println("Entry set: " + map.entrySet()); // 输出: Entry set: [Go=6, Swift=7]

        // 13. getOrDefault(Object key, V defaultValue) - 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回默认值
        Integer defaultValue = map.getOrDefault("Kotlin", 8);
        System.out.println("Get 'Kotlin' or default 8: " + defaultValue); // 输出: Get 'Kotlin' or default 8: 8

        // 14. putIfAbsent(K key, V value) - 如果指定键尚未与值关联（或映射为 null），则将它与给定值关联并返回 null；否则返回当前值
        map.putIfAbsent("Go", 9);
        map.putIfAbsent("Kotlin", 10);
        System.out.println("After putIfAbsent: " + map); // 输出: After putIfAbsent: {Go=6, Swift=7, Kotlin=10}

        // 15. replace(K key, V value) - 仅当指定键当前映射到某个值时，替换该键的映射关系
        map.replace("Swift", 11);
        System.out.println("After replace 'Swift': " + map); // 输出: After replace 'Swift': {Go=6, Swift=11, Kotlin=10}

        // 16. replace(K key, V oldValue, V newValue) - 仅当当前映射到指定值时，替换指定键的映射关系
        boolean replaced = map.replace("Go", 6, 12);
        System.out.println("After replace 'Go' from 6 to 12: " + map + ", replaced: " + replaced); // 输出: After replace 'Go' from 6 to 12: {Go=12, Swift=11, Kotlin=10}, replaced: true

        // 17. computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) - 如果指定键尚未与值关联，则尝试使用给定映射函数计算其值，并将其输入此映射中
        map.computeIfAbsent("Rust", k -> 13);
        System.out.println("After computeIfAbsent 'Rust': " + map); // 输出: After computeIfAbsent 'Rust': {Go=12, Swift=11, Kotlin=10, Rust=13}

        // 18. computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) - 如果指定键的值存在且非空，则尝试计算新值并将其输入此映射中
        map.computeIfPresent("Kotlin", (k, v) -> v + 1);
        System.out.println("After computeIfPresent 'Kotlin': " + map); // 输出: After computeIfPresent 'Kotlin': {Go=12, Swift=11, Kotlin=11, Rust=13}

        // 19. compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) - 尝试计算指定键及其当前映射值的映射，如果计算结果为 null，则移除该映射
        map.compute("Rust", (k, v) -> v != null ? v + 1 : null);
        System.out.println("After compute 'Rust': " + map); // 输出: After compute 'Rust': {Go=12, Swift=11, Kotlin=11, Rust=14}

        // 20. merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) - 如果指定的键尚未与值关联，或与 null 关联，则将其与给定值关联，否则将给定值与当前值关联，使用给定的 remapping 函数计算新值
        map.merge("Swift", 2, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("After merge 'Swift': " + map); // 输出: After merge 'Swift': {Go=12, Swift=13, Kotlin=11, Rust=14}

        // 21. forEach(BiConsumer<? super K, ? super V> action) - 对此映射中的每个映射关系执行给定的操作
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v)); // 输出: 各个映射关系的键和值
    }
}
