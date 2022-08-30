class Solution {
    public boolean canConstruct(String r, String m) {
       int a[]=new int[26];
        int b[]=new int[26];
        for(char c: r.toCharArray())
        {
            a[c-'a']++;
        }
        for(char c: m.toCharArray())
        {
            b[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]>b[i])
                return false;
        }
        return true;
    }
}