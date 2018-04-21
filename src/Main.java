import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String>result = letterCasePermutation(s);
        for (String element: result){
            System.out.println(element);
        }
    }
    public static List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return Arrays.asList("");
        }
        helper(res, s, 0, "");
        return res;
    }
    public static void helper(List<String> res, String s, int pos, String temp) {
        if (pos == s.length()) {
            res.add(temp);
            return;
        }

        char cur = s.charAt(pos);

        if (Character.isLetter(cur)) {
            helper(res, s, pos + 1, temp + Character.toUpperCase(cur));
            helper(res, s, pos + 1, temp + Character.toLowerCase(cur));
        } else {
            helper(res, s, pos + 1, temp + cur);
        }

    }
}
