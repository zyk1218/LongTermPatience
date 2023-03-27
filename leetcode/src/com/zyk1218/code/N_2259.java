package com.zyk1218.code;

/**
 * 给你一个表示某个正整数的字符串 number 和一个字符 digit 。
 * <p>
 * 从 number 中 恰好 移除 一个 等于 digit 的字符后，找出并返回按 十进制 表示 最大 的结果字符串。生成的测试用例满足 digit 在 number 中出现至少一次。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-digit-from-number-to-maximize-result
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 示例 1：
 * <p>
 * 输入：number = "123", digit = "3"
 * 输出："12"
 * 解释："123" 中只有一个 '3' ，在移除 '3' 之后，结果为 "12" 。
 * 示例 2：
 * <p>
 * 输入：number = "1231", digit = "1"
 * 输出："231"
 * 解释：可以移除第一个 '1' 得到 "231" 或者移除第二个 '1' 得到 "123" 。
 * 由于 231 > 123 ，返回 "231" 。
 * 示例 3：
 * <p>
 * 输入：number = "551", digit = "5"
 * 输出："51"
 * 解释：可以从 "551" 中移除第一个或者第二个 '5' 。
 * 两种方案的结果都是 "51" 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-digit-from-number-to-maximize-result
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class N_2259 {

    public static void main(String[] args) {
        String testNumber1 = "73197";
        char testDigit1 = '7';
        System.out.println("7319".equals(removeDigit(testNumber1, testDigit1)));

        String testNumber2 = "1231";
        char testDigit2 = '1';
        System.out.println("231".equals(removeDigit(testNumber2, testDigit2)));

        String testNumber3 = "551";
        char testDigit3 = '5';
        System.out.println("51".equals(removeDigit(testNumber3, testDigit3)));
    }

    private static String removeDigit(String number, char digit) {
        String result = number;
        // case: 不包含，直接返回
        if (null == number || 0 == number.length()) {
            return "";
        }
        if (!number.contains(String.valueOf(digit))) {
            return result;
        } else {
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) == digit && i+1 < number.length() && number.charAt(i) < number.charAt(i + 1)) {
                    return number.substring(0, i) + number.substring(i + 1);
                }
            }
        }
        return number.substring(0, number.lastIndexOf(digit)) + number.substring(number.lastIndexOf(digit) + 1);
    }


}
