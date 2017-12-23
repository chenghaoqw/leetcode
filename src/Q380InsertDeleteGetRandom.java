import java.util.ArrayList;

public class Q380InsertDeleteGetRandom {
    private ArrayList<Integer> data;
    java.util.Random rand = new java.util.Random();
    /** Initialize your data structure here. */
    public void RandomizedSet() {
        data=new ArrayList<Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        for(int i=0;i<data.size();i++){
            if(data.get(i)==val){
                return false;
            }
        }
        data.add(val);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        boolean result=false;
        for(int i=0;i<data.size();i++){
            if(data.get(i)==val){
                data.remove(i);
                return true;
            }
        }
        return false;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int x=rand.nextInt(data.size());
        return data.get(x);
    }
}
