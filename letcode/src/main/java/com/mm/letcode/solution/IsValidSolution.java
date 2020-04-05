package com.mm.letcode.solution;

import ch.qos.logback.classic.pattern.LineOfCallerConverter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author fujie.feng
 * @Date 2020-04-05
 */
public class IsValidSolution {

    private static final Map<Character, Character> map = new HashMap<>();
    static {
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character>  stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (stack.size() == 0 || !map.get(c).equals(stack.pop())) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        IsValidSolution is = new IsValidSolution();

        System.out.println(is.isValid("()"));
    }

}