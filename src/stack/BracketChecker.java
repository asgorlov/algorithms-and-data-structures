package stack;

import utils.ArrayUtil;

import java.io.IOException;

/**
 * @author ango1019
 * Date: 25.03.2020
 * Time: 14:25
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public void check() {
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);

        for (int i = 0; i < stackSize; i++) {
            char c = input.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!stack.isEmpty()) {
                        char ch = stack.pop();
                        if ((c == '}' && ch != '{') ||
                            (c == ']' && ch != '[') ||
                            (c == ')' && ch != '(')) {
                            System.out.println("Error: " + c + " at " + i);
                        }
                    } else {
                        System.out.println("Error: " + c + " at " + i);
                        break;
                    }
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }
}

class BracketsApp {
    public static void main(String[] args) throws IOException {
        String input;

        while (true) {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = ArrayUtil.getString();
            if (input.equals("")) {
                break;
            }

            BracketChecker bracketChecker = new BracketChecker(input);
            bracketChecker.check();
        }
    }
}