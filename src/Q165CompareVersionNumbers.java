public class Q165CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] a1=version1.split("\\.");
        String[] a2=version2.split("\\.");
        for(int i=0;i<a1.length || i<a2.length;i++){
            if(i>=a1.length){
                if(Integer.valueOf(a2[i])!=0) return -1;
                else continue;
            }
            if(i>=a2.length){
                if(Integer.valueOf(a1[i])!=0) return 1;
                else continue;
            }
            if(Integer.valueOf(a1[i])>Integer.valueOf(a2[i])) return 1;
            else if(Integer.valueOf(a1[i])<Integer.valueOf(a2[i])) return -1;
        }
        return 0;
    }
}
