public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        if (nums1.length > nums2.length) {
            result = calc(nums2, nums1);
        } else {
            result = calc(nums1, nums2);
        }
        return result;
    }

    public double calc(int[] n1, int[] n2) {
        int l1 = n1.length;
        int l2 = n2.length;
        int flag = (l1 + l2) % 2;
        int half = (l1 + l2) / 2;
        int left = 0;
        int right = l1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int mid2 = half - mid;
            if (mid > 0 && mid2 < l2 && n1[mid - 1] > n2[mid2]) {
                right = mid - 1;
            } else if (mid2 > 0 && mid < l1 && n2[mid2 - 1] > n1[mid]) {
                left = mid + 1;
            } else {
                if (flag == 1) {
                    return Math.min(mid < l1 ? n1[mid] : Integer.MAX_VALUE, mid2 < l2 ? n2[mid2] : Integer.MAX_VALUE);
                } else {
                    return (Math.max(mid > 0 ? n1[mid - 1] : Integer.MIN_VALUE, mid2 > 0 ? n2[mid2 - 1] : Integer.MIN_VALUE) + Math.min(mid < l1 ? n1[mid] : Integer.MAX_VALUE, mid2 < l2 ? n2[mid2] : Integer.MAX_VALUE)) / 2.0;
                }
            }
        }
        return 0.0;
    }
}
