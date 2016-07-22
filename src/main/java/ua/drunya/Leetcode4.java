package ua.drunya;

public class Leetcode4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;
        int[] larger = nums1.length <= nums2.length ? nums2 : nums1;

        int low = 0;
        int high = smaller.length;


        while (low <= high) {

            int middle = (low + high) / 2;

            int si = middle == 0 ? Integer.MIN_VALUE : smaller[middle - 1];
            int si1 = middle == smaller.length ? Integer.MAX_VALUE : smaller[middle];

            int j = (nums1.length + nums2.length) / 2 - middle;

            int li = j == 0 ? Integer.MIN_VALUE : larger[j - 1];
            int li1 = j == larger.length ? Integer.MAX_VALUE : larger[j];

            if (si > li1) {
                high = middle;
            } else if (li > si1) {
                low = middle + 1;
            } else {
                return (nums1.length + nums2.length) % 2 == 0
                        ? (double) (Math.max(si, li) + Math.min(si1, li1)) / 2
                        : Math.min(si1, li1);
            }

        }

        return 0.0d;
    }
}
