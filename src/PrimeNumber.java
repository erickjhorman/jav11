public class PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        String message = "";
        long count = 0;
        int l=(int)Math.sqrt(n);
        for (int i = 1; i <= l; i++) {
            if (Math.sqrt(n) % i == 0) {
                count++;
                System.out.print("count" + count);
            }
            if (count == 2) {
                message = "Prime";
            } else {
                message = "Not prime";
            }
        }


    }
}
