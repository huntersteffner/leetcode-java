public class MergeSortedArray {
    public static void main(String[] args) {
        int[] exampleOneArrayOne = {1,2,3,0,0,0};
        int[] exampleOneArrayTwo = {2,5,6};
        merge(exampleOneArrayOne, 3, exampleOneArrayTwo, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = nums1.clone();

        int j = 0;
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (k < n) {
                if (j < m && nums1Copy[j] < nums2[k]) {
                    nums1[i] = nums1Copy[j];
                    j++;
                } else {
                    nums1[i] = nums2[k];
                    k++;
                }
            } else {
                nums1[i] = nums1Copy[j];
                j++;
            }
        }

        System.out.println("test");
    }
}
