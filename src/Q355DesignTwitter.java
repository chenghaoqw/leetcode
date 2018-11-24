import java.util.*;

public class Q355DesignTwitter {
    int index = 0;

    class Message {
        public int index;
        public int id;

        public Message(int index, int id) {
            this.index = index;
            this.id = id;
        }
    }

    HashMap<Integer, Set<Integer>> users = new HashMap();
    HashMap<Integer, Set<Message>> messages = new HashMap();

    /**
     * Initialize your data structure here.
     */
    public Q355DesignTwitter() {

    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        Message m = new Message(++index, tweetId);
        Set<Message> set = messages.getOrDefault(userId, new HashSet<Message>());
        set.add(m);
        messages.put(userId, set);
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        Set<Message> sets = new TreeSet(new Comparator<Message>() {
            @Override
            public int compare(Message m1, Message m2) {
                return m2.index - m1.index;
            }
        });
        sets.addAll(messages.getOrDefault(userId, new HashSet<Message>()));
        if (users.containsKey(userId))
            for (int f : users.get(userId)) sets.addAll(messages.getOrDefault(f, new HashSet<Message>()));
        List<Integer> ret = new ArrayList();
        int count = 0;
        for (Message m : sets) {
            if (count >= 10) break;
            count++;
            ret.add(m.id);
        }
        return ret;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a no-op.
     */
    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId)
            return;
        Set<Integer> set = users.getOrDefault(followerId, new HashSet<Integer>());
        set.add(followeeId);
        users.put(followerId, set);
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId || !users.containsKey(followerId) || !users.get(followerId).contains(followeeId))
            return;
        Set<Integer> set = users.get(followerId);
        set.remove(followeeId);
    }
}
