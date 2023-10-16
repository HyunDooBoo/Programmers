package Lv_1;
import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        String callingplayer;
        int callinggrade ;
        String front;
        HashMap<String, Integer> player = new LinkedHashMap<>();
        HashMap<Integer, String> grade = new LinkedHashMap<>();
        for(int i = 0; i<players.length; i++){
            player.put(players[i], i);
            grade.put(i, players[i]);
        }
        for(int i = 0; i<callings.length; i++){
            callinggrade = player.get(callings[i]);
            callingplayer = grade.get(callinggrade);
            
            front = grade.get(callinggrade-1);
            
            player.replace(callingplayer, callinggrade-1);
            player.replace(front, callinggrade);
            
            grade.replace(callinggrade - 1, callingplayer);
            grade.replace(callinggrade, front);
        }
        for(int i = 0; i<players.length; i++){
            answer[i] = grade.get(i);
        }
        return answer;
    }
}
