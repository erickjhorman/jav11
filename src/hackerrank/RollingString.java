package hackerrank;

public class RollingString {
    public static void main(String[] args) {
        rollingString("abc");
    }

    private static String rollingString(String s) {
        String finalString = "";
        String[] operations = {"0 0 L", "2 2 L", "0 2 R"};
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(0);
            String oper = operations[0];
            char ch = oper.replace(" ", "").charAt(s.length() - 1);
            int j = s.length() - 1;
            char b = s.charAt(j);
            while (i < j) {
                if (ch == 'L') {

                } else  if(ch == 'R'){

                }
            }
        }
        return "";
    }
}
