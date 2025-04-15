package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public static int Task1(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int index : b) {
            if (index >= 0 && index < a.size()) {
                sum += a.get(index);
            }
        }
        return sum;
    }
    public static List<String> Task2(List<String> InputList){
        String CurrElement;

        for (int i = 0;i<InputList.size();i++){
            CurrElement = InputList.get(i);
            CurrElement = CurrElement.substring(1);

            if (CurrElement == ""){
                InputList.remove(i);
            } else{
                InputList.set(i, CurrElement);
            }
        }
        return InputList;
    }

    public static boolean Task3(String input) {
        int count = 0;
    
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
    
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
                if (count < 0) {
                    // More closing brackets than opening
                    return false;
                }
            }
        }
        
        // If count is 0, all brackets matched properly
        return count == 0;
    }


    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) {
            return null;
        }

        List<Integer> result = new ArrayList<>();
        int num = a.size();

        for (int i = 0; i < num; i++) {
            int product = a.get(i) * b.get(num - 1 - i);
            result.add(product);
        }

        return result;

    }

}

    