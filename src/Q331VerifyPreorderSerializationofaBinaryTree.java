public class Q331VerifyPreorderSerializationofaBinaryTree {
    public boolean isValidSerialization(String preorder) {
        preorder += ",";
        String[] array = preorder.split(",");
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i].equals("#") && array.length != 1) return false;
            if (--count < 0) return false;
            if (!array[i].equals("#")) count += 2;
        }
        return count == 0;
    }
}