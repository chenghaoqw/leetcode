public class Q11ContainerWithMostWater {
    public int maxArea(int[] height) {
        if (height.length <= 1) {
            return 0;
        }
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        for (; right - left > 0; ) {
            int temp = 0;
            if (height[right] < height[left]) {
                temp = height[right];
                right--;
            } else {
                temp = height[left];
                left++;
            }
            temp = temp * (right - left + 1);
            if (temp > result) {
                result = temp;
            }
        }
        return result;
    }
}
