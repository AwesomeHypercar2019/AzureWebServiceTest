public class ThreeNPlusOne{
    public static void main(String[] args) {
        long n = 312985742;
        func(n);
    }

    private static void func(long n){
        if (n < 0) return;
        long x = n;
        while (x > 1){
            System.out.println(x);
            if (x % 2 == 1){
                x = 3 * x + 1;
            } else {
                x /= 2;
            }
        }
    }
}