import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        String target;
        HashMap<Character, Integer> key = new HashMap<>();
        for(int i=0; i<keymap.length; i++){
            for (int j=0; j<keymap[i].length(); j++){
                char tmp = keymap[i].charAt(j);
                if(key.containsKey(tmp)){
                    int idx = key.get(tmp);
                    key.put(tmp, Math.min(idx, j+1));
                }else{
                    key.put(tmp, j+1);
                }
            }
        }
        for (int i = 0; i<targets.length; i++){
            target = targets[i];
            boolean chk = true;
            int count = 0;
            for(char tmp:target.toCharArray()){
                if(key.containsKey(tmp)){
                    count += key.get(tmp);
                }
                else{
                    chk = false;
                    break;
                }
            }
            answer[i] = chk? count:-1;
        }
        return answer;
    }
}