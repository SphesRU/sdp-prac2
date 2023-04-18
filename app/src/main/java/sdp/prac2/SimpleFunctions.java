package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    // returns true only if there are a matching number of ( and ) brackets in a string, and those brackets are nested correctly.
    public boolean task3(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }

    public int task1(List<Integer> list1, List<Integer> list2) {
        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) < list1.size()) {
                sum += list1.get(list2.get(i));
            }
        }
        return sum;
    }
      public static List<String> task2(List<String> lst) {
        List<String> result = new ArrayList<>();
        for (String s : lst) {
            if (s.length() > 1) {
                result.add(s.substring(1));
            }
        }
        return result;
    } //Task 2

}
