public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        int sqrt = (int) Math.sqrt(x);
        return sqrt;
    }
}
