public class Q506RelativeRanks {
    public String[] findRelativeRanks(int[] nums) {
        String[] result = new String[nums.length];
        rank[] ids = new rank[nums.length];

        for (int i = 0; i < nums.length; i++)
            ids[i] = new rank(i);

        Arrays.sort(ids,
            new Comparator<rank>() {
                @Override
                public int compare(rank o1, rank o2) {
                    return nums[o2.index] - nums[o1.index];
                }
            });

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[ids[i].index] = "Gold Medal";
            } else if (i == 1) {
                result[ids[i].index] = "Silver Medal";
            } else if (i == 2) {
                result[ids[i].index] = "Bronze Medal";
            } else {
                result[ids[i].index] = (i + 1) + "";
            }
        }

        return result;
    }

    class rank {
        int index;

        public rank(int i) {
            index = i;
        }
    }
}
