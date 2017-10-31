public class Q167TwoSumIInputarrayissorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int begin = 0;
        int end = numbers.length - 1;
        for (; end > begin; ) {
            if (numbers[begin] + numbers[end] > target) {
                end--;
            } else if (numbers[begin] + numbers[end] < target) {
                begin++;
            } else {
                result[0] = begin + 1;
                result[1] = end + 1;
                return result;
            }
        }
        return result;
    }
}
