package hackerrank;

public class isBalanced {
    public static void main(String[] args) {
        String s = "";
        String message = "", reverse = "";
        int right = s.length() / 2, left = right;
        String right2 = s.substring(right);
        String left2 = s.substring(0, left);
        for (int i = right2.length() - 1; i >= 0; i--) {
            if (right2.charAt(i) == '}') {
                reverse = reverse + '{';
            } else if (right2.charAt(i) == ']') {
                reverse = reverse + '[';
            } else if (right2.charAt(i) == ')') {
                reverse = reverse + '(';
            }
            if (left2.equals(reverse))
                message = "YES";
            else
                message = "NO";
        }
        System.out.println("response" + message);
    }
}
