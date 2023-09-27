class Solution {
    public String restoreString(String s, int[] indices) {
        TreeMap<Integer, Character > map = new TreeMap<>();
        for(int i=0;i<indices.length;i++){
            map.put(indices[i], s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int key: map.keySet()){
            char ch = map.get(key);
            sb.append(ch);
        }
        return sb.toString();
    }
}
