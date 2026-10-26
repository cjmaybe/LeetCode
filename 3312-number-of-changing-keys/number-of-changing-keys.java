class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String n=s.toLowerCase();
        for(int i=1;i<n.length();i++){
            if(n.charAt(i)!=n.charAt(i-1)){
                count++;
            }
        }return count;
    }
}