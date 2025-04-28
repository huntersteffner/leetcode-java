public class ClimbStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }

    public static int climbStairs(int n) {

        if (n <= 2) {
            return n;
        }

        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i < arr.length; i ++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}

// 1 1 1 1 1 1
//   2 1 1 1 1
//   1 2 1 1 1
//   1 1 2 1 1
//   1 1 1 2 1
//   1 1 1 1 2
//     2 2 1 1
//     2 1 2 1
//     2 1 1 2
//     1 2 2 1
//     1 2 1 2
//     1 1 2 2
//       2 2 2