class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean n = true;

        for (char ch='a';ch<='z';ch++){
            boolean found = false;
            for(int i=0;i<sentence.length();i++) {
                if(sentence.charAt(i)==ch){
                    found=true;
                    break;
                }
            }
            if(found==false){
                return false;
            }
        }
        return n;
    }
}