class Solution {
    public static String firstWord(int n, String[] dictionary) {
        // code here
        HashSet<String> set  = new HashSet<>();
        for(String s: dictionary){
            if(set.contains(s)) return "Invalid";
            else{
                set.add(s);
            }
        }
        Arrays.sort(dictionary);
        return dictionary[0];
    }
}