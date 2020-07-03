package stack;

import utils.ArrayUtil;

import java.io.IOException;

/**
 * @author ango1019
 * Date: 25.03.2020
 * Time: 13:37
 */
public class Reverser {
    private String input;
    private StringBuilder output;

    public Reverser(String input) {
        this.input = input;
        output = new StringBuilder();
    }

    public String doReverse() {
        int stackSize = input.length();
        StackX stack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            char c = stack.pop();
            output.append(c);
        }

        return output.toString();
    }
}

class ReverseApp {
    public static void main(String[] args) throws IOException {
        String input;
        String output;

        while (true) {
            System.out.print("Enter a string: ");
            System.out.flush();
            input = ArrayUtil.getString();
            if (input.equals("")) {
                break;
            }

            Reverser reverser = new Reverser(input);
            output = reverser.doReverse();
            System.out.println("Reversed: " + output);
        }
    }
}