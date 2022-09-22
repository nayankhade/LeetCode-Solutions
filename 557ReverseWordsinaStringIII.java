class Solution {
    public String reverseWords(String s) {
       String[] rv=s.split("\\s");
       String reverseWord = "";
        for(String word : rv){
            reverseWord += new StringBuilder(word).reverse().toString() + " ";
        }
        return reverseWord.trim();
    }
}