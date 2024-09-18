import java.util.Arrays; // 导入java.util.Arrays以便使用Arrays.toString

public class StringFunctionsExample {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 = "hello, world!";

        // 1. length() - 返回字符串的长度
        int length = str.length();
        System.out.println("Length: " + length); // 输出: Length: 13

        // 2. charAt() - 返回指定索引处的字符
        char ch = str.charAt(1);
        System.out.println("Character at index 1: " + ch); // 输出: Character at index 1: e

        // 3. substring(int beginIndex) - 返回从指定索引开始到结尾的子字符串
        String substr = str.substring(7);
        System.out.println("Substring from index 7: " + substr); // 输出: Substring from index 7: World!

        // 4. substring(int beginIndex, int endIndex) - 返回从beginIndex到endIndex之间的子字符串
        String substr2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substr2); // 输出: Substring from index 7 to 12: World

        // 5. contains(CharSequence s) - 判断字符串是否包含指定的字符序列
        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains); // 输出: Contains 'World': true

        // 6. equals(Object anObject) - 比较两个字符串是否相等
        boolean equals = str.equals(str2);
        System.out.println("Equals 'hello, world!': " + equals); // 输出: Equals 'hello, world!': false

        // 7. equalsIgnoreCase(String anotherString) - 忽略大小写比较两个字符串是否相等
        boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
        System.out.println("EqualsIgnoreCase 'hello, world!': " + equalsIgnoreCase); // 输出: EqualsIgnoreCase 'hello, world!': true

        // 8. toLowerCase() - 将字符串转换为小写
        String lowerCase = str.toLowerCase();
        System.out.println("Lower case: " + lowerCase); // 输出: Lower case: hello, world!

        // 9. toUpperCase() - 将字符串转换为大写
        String upperCase = str.toUpperCase();
        System.out.println("Upper case: " + upperCase); // 输出: Upper case: HELLO, WORLD!

        // 10. trim() - 去除字符串两端的空格
        String strWithSpaces = "   Hello, World!   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Trimmed: '" + trimmed + "'"); // 输出: Trimmed: 'Hello, World!'

        // 11. replace(char oldChar, char newChar) - 替换字符串中的指定字符
        String replaced = str.replace('o', 'a');
        System.out.println("Replaced 'o' with 'a': " + replaced); // 输出: Replaced 'o' with 'a': Hella, Warld!

        // 12. replace(CharSequence target, CharSequence replacement) - 替换字符串中的指定字符序列
        String replacedSequence = str.replace("World", "Java");
        System.out.println("Replaced 'World' with 'Java': " + replacedSequence); // 输出: Replaced 'World' with 'Java': Hello, Java!

        // 13. split(String regex) - 根据指定的正则表达式分割字符串
        String[] parts = str.split(", ");
        System.out.println("Split by ', ': " + Arrays.toString(parts)); // 输出: Split by ', ': [Hello, World!]

        // 14. indexOf(int ch) - 返回指定字符在字符串中第一次出现的索引
        int indexOfChar = str.indexOf('o');
        System.out.println("Index of 'o': " + indexOfChar); // 输出: Index of 'o': 4

        // 15. indexOf(String str) - 返回指定子字符串在字符串中第一次出现的索引
        int indexOfString = str.indexOf("World");
        System.out.println("Index of 'World': " + indexOfString); // 输出: Index of 'World': 7

        // 16. lastIndexOf(int ch) - 返回指定字符在字符串中最后一次出现的索引
        int lastIndexOfChar = str.lastIndexOf('o');
        System.out.println("Last index of 'o': " + lastIndexOfChar); // 输出: Last index of 'o': 8

        // 17. lastIndexOf(String str) - 返回指定子字符串在字符串中最后一次出现的索引
        int lastIndexOfString = str.lastIndexOf("World");
        System.out.println("Last index of 'World': " + lastIndexOfString); // 输出: Last index of 'World': 7

        // 18. startsWith(String prefix) - 判断字符串是否以指定前缀开始
        boolean startsWith = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWith); // 输出: Starts with 'Hello': true

        // 19. endsWith(String suffix) - 判断字符串是否以指定后缀结束
        boolean endsWith = str.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWith); // 输出: Ends with 'World!': true

        // 20. isEmpty() - 判断字符串是否为空（长度为0）
        boolean isEmpty = str.isEmpty();
        System.out.println("Is empty: " + isEmpty); // 输出: Is empty: false

        // 21. format(String format, Object... args) - 返回一个格式化后的字符串
        String formatted = String.format("Name: %s, Age: %d", "Alice", 30);
        System.out.println("Formatted: " + formatted); // 输出: Formatted: Name: Alice, Age: 30

        // 22. join(CharSequence delimiter, CharSequence... elements) - 连接元素并用指定的分隔符分隔
        String joined = String.join(", ", "Java", "Python", "C++");
        System.out.println("Joined: " + joined); // 输出: Joined: Java, Python, C++
    }
}
