class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        int n1=s1.length;
        int n2=t1.length;
        if(n1!=n2) return false;
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i=0; i<n1; i++){
            if(s1[i]!=t1[i]){
                return false;
            }
        }
        return true;
    }
}