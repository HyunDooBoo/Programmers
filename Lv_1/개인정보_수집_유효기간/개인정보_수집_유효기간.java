import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String,Integer> termMap = new HashMap<>();
    	for (String term:terms) {
    		String[] ts = term.split(" ");
    		termMap.put(ts[0], Integer.parseInt(ts[1])*28);
    	}
    	for (int i=0; i < privacies.length; i++) {
    		String[] privacy = privacies[i].split(" ");
    		if (getDate(privacy[0]) + termMap.get(privacy[1]) <= getDate(today)) {
    			answer.add(i+1);
    		}
    	}
        return answer.stream().mapToInt(integer -> integer).toArray();
    }
    private int getDate(String today) {
    	String[] date = today.split("\\.");
    	return Integer.parseInt(date[0])*12*28+Integer.parseInt(date[1])*28+Integer.parseInt(date[2]);
    }
}