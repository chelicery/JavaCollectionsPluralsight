package art.b.Stack;

import java.util.ArrayDeque;

public class Calculator {


    public int evaluate(final String input){
        final ArrayDeque<String> stack = new ArrayDeque<>();
        final String[] tokens = input.split(" ");

        for (String t : tokens){
            stack.add(t);
        }

        while(stack.size() > 1){
            int left = Integer.parseInt(stack.pop());
            String mid = stack.pop();
            int right = Integer.parseInt(stack.pop());

            int result = 0;

            switch (mid){
                case "+":
                    result = left + right;
                    break;
                case "-":
                    result = left - right;
                    break;
            }
            stack.push(String.valueOf(result));
        }
        return Integer.parseInt(stack.pop());
    }

}
