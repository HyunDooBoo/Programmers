class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x = -1;
        int y = -1;
        int height = park.length;
        int weight = park[0].length();
        for(int i = 0; i<park.length; i++){
            if (park[i].indexOf('S') != -1){
                x = park[i].indexOf('S');
                y = i;
                break;
            }
        }
        for (int i = 0; i<routes.length; i++){
            String[] tmp = routes[i].split(" ");
            String vector = tmp[0];
            int distance = Integer.parseInt(tmp[1]);
            boolean flag = true;
            if (vector.equals("E")){
                for(int j=1; j <=distance; j++){
                    if (x+j >= weight){
                        flag = false;
                        break;
                    }else if(park[y].charAt(x+j) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    x += distance;
                }
            }
            else if (vector.equals("W")){
                for(int j=1; j <=distance; j++){
                    if (x-j < 0){
                        flag = false;
                        break;
                    }else if(park[y].charAt(x-j) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    x -= distance;
                }
            }
            else if (vector.equals("S")){
                for(int j=1; j <=distance; j++){
                    if (y+j >= height){
                        flag = false;
                        break;
                    }else if(park[y+j].charAt(x) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    y += distance;
                }
            }
            else if (vector.equals("N")){
                for(int j=1; j <=distance; j++){
                    if (y-j < 0){
                        flag = false;
                        break;
                    }else if(park[y-j].charAt(x) =='X'){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    y -= distance;
                }
            }
        }
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
}