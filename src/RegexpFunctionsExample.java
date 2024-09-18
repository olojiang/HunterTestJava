import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpFunctionsExample {

    public static void main(String[] args) {
        // 1. Pattern.compile(String regex) - 编译给定的正则表达式
        // 参数: regex - 要编译的正则表达式
        Pattern pattern = Pattern.compile("\\d+");
        System.out.println("Pattern compiled: \\d+"); // 输出: Pattern compiled: \d+

        // 2. Matcher matcher(CharSequence input) - 创建匹配给定输入的匹配器
        // 参数: input - 要匹配的输入字符序列
        Matcher matcher = pattern.matcher("123abc456");

        // 3. boolean find() - 尝试查找输入序列的下一个子序列，该子序列匹配此匹配器的模式
        while (matcher.find()) {
            System.out.println("Found match: " + matcher.group()); // 输出: Found match: 123 和 Found match: 456
        }

        // 4. String group() - 返回由以前匹配操作匹配的输入子序列
        // 此函数在 find() 中已经展示

        // 5. boolean matches() - 尝试将整个区域与模式匹配
        Matcher matcher2 = pattern.matcher("123456");
        System.out.println("Matches entire string: " + matcher2.matches()); // 输出: Matches entire string: true

        // 6. boolean lookingAt() - 尝试从输入序列的开头匹配该模式
        Matcher matcher3 = pattern.matcher("123abc");
        System.out.println("Looking at beginning: " + matcher3.lookingAt()); // 输出: Looking at beginning: true

        // 7. static boolean matches(String regex, CharSequence input) - 编译给定正则表达式并匹配给定输入
        // 参数: regex - 要编译的正则表达式, input - 要匹配的输入字符序列
        boolean matches = Pattern.matches("\\d+", "7890");
        System.out.println("Pattern matches input: " + matches); // 输出: Pattern matches input: true

        // 8. String replaceAll(String replacement) - 替换所有匹配的子字符串
        // 参数: replacement - 用来替换匹配子字符串的字符串
        String replacedAll = matcher.replaceAll("#");
        System.out.println("Replaced all: " + replacedAll); // 输出: Replaced all: #abc#

        // 9. String replaceFirst(String replacement) - 替换第一个匹配的子字符串
        // 参数: replacement - 用来替换匹配子字符串的字符串
        String replacedFirst = matcher.replaceFirst("#");
        System.out.println("Replaced first: " + replacedFirst); // 输出: Replaced first: #abc456

        // 10. String[] split(CharSequence input, int limit) - 根据正则表达式的匹配拆分输入序列
        // 参数: input - 要拆分的输入字符序列, limit - 结果数组的最大长度
        String[] split = pattern.split("one1two2three3", 2);
        System.out.println("Split result: " + String.join(", ", split)); // 输出: Split result: one, two2three3

        // 11. String[] split(CharSequence input) - 根据正则表达式的匹配拆分输入序列
        // 参数: input - 要拆分的输入字符序列
        String[] split2 = pattern.split("one1two2three3");
        System.out.println("Split result: " + String.join(", ", split2)); // 输出: Split result: one, two, three

        // 12. String quote(String s) - 返回指定字符串的字面值模式字符串
        // 参数: s - 要引用的字符串
        String quoted = Pattern.quote("a+b.c");
        System.out.println("Quoted string: " + quoted); // 输出: Quoted string: \Q a+b.c\E
    }
}
