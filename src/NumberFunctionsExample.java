public class NumberFunctionsExample {
    public static void main(String[] args) {
        // 1. parseInt(String s) - 将字符串解析为int类型
        int num1 = Integer.parseInt("123");
        System.out.println("Parsed int: " + num1); // 输出: Parsed int: 123

        // 2. parseDouble(String s) - 将字符串解析为double类型
        double num2 = Double.parseDouble("123.45");
        System.out.println("Parsed double: " + num2); // 输出: Parsed double: 123.45

        // 3. valueOf(String s) - 将字符串解析为Integer对象
        Integer num3 = Integer.valueOf("123");
        System.out.println("Integer valueOf: " + num3); // 输出: Integer valueOf: 123

        // 4. valueOf(String s) - 将字符串解析为Double对象
        Double num4 = Double.valueOf("123.45");
        System.out.println("Double valueOf: " + num4); // 输出: Double valueOf: 123.45

        // 5. intValue() - 将Number对象转换为int类型
        int num5 = num3.intValue();
        System.out.println("intValue: " + num5); // 输出: intValue: 123

        // 6. doubleValue() - 将Number对象转换为double类型
        double num6 = num4.doubleValue();
        System.out.println("doubleValue: " + num6); // 输出: doubleValue: 123.45

        // 7. compareTo(Number anotherNumber) - 比较两个Number对象
        int compareResult = num3.compareTo(100);
        System.out.println("compareTo: " + compareResult); // 输出: compareTo: 1 (123 > 100)

        // 8. equals(Object obj) - 判断两个Number对象是否相等
        boolean isEqual = num3.equals(123);
        System.out.println("equals: " + isEqual); // 输出: equals: true

        // 9. toString() - 将Number对象转换为字符串
        String numStr = num3.toString();
        System.out.println("toString: " + numStr); // 输出: toString: 123

        // 10. Math.abs(int a) - 返回参数的绝对值
        int absValue = Math.abs(-123);
        System.out.println("Math.abs: " + absValue); // 输出: Math.abs: 123

        // 11. Math.max(int a, int b) - 返回两个int值中的较大值
        int maxValue = Math.max(10, 20);
        System.out.println("Math.max: " + maxValue); // 输出: Math.max: 20

        // 12. Math.min(int a, int b) - 返回两个int值中的较小值
        int minValue = Math.min(10, 20);
        System.out.println("Math.min: " + minValue); // 输出: Math.min: 10

        // 13. Math.pow(double a, double b) - 返回a的b次幂
        double powerValue = Math.pow(2, 3);
        System.out.println("Math.pow: " + powerValue); // 输出: Math.pow: 8.0

        // 14. Math.sqrt(double a) - 返回参数的平方根
        double sqrtValue = Math.sqrt(16);
        System.out.println("Math.sqrt: " + sqrtValue); // 输出: Math.sqrt: 4.0

        // 15. Math.random() - 返回一个[0.0, 1.0)范围内的随机数
        double randomValue = Math.random();
        System.out.println("Math.random: " + randomValue); // 输出: Math.random: 随机数

        // 16. Math.round(double a) - 将参数四舍五入为最接近的long值
        long roundedValue = Math.round(123.45);
        System.out.println("Math.round: " + roundedValue); // 输出: Math.round: 123

        // 17. Math.ceil(double a) - 返回大于或等于参数的最小整数（向上取整）
        double ceilValue = Math.ceil(123.45);
        System.out.println("Math.ceil: " + ceilValue); // 输出: Math.ceil: 124.0

        // 18. Math.floor(double a) - 返回小于或等于参数的最大整数（向下取整）
        double floorValue = Math.floor(123.45);
        System.out.println("Math.floor: " + floorValue); // 输出: Math.floor: 123.0

        // 19. Math.log(double a) - 返回参数的自然对数（底数为e）
        double logValue = Math.log(10);
        System.out.println("Math.log: " + logValue); // 输出: Math.log: 2.302585092994046

        // 20. Math.exp(double a) - 返回e的参数次幂
        double expValue = Math.exp(2);
        System.out.println("Math.exp: " + expValue); // 输出: Math.exp: 7.389056098930649

        // 21. Math.sin(double a) - 返回指定角度的正弦值
        double sinValue = Math.sin(Math.PI / 2);
        System.out.println("Math.sin: " + sinValue); // 输出: Math.sin: 1.0

        // 22. Math.cos(double a) - 返回指定角度的余弦值
        double cosValue = Math.cos(Math.PI / 2);
        System.out.println("Math.cos: " + cosValue); // 输出: Math.cos: 6.123233995736766E-17 (接近于0)

        // 23. Math.tan(double a) - 返回指定角度的正切值
        double tanValue = Math.tan(Math.PI / 4);
        System.out.println("Math.tan: " + tanValue); // 输出: Math.tan: 1.0
    }
}
