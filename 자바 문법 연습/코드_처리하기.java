class Solution {
    public String solution(String code) {
        String ret = "";
        char tmp;
        int mode =0;
        for(int i = 0; i<code.length(); i++){
            tmp = code.charAt(i);
            if (tmp=='1'){
                mode = mode==1 ? 0:1;
                continue;
            }
            if (mode==0 && i % 2 == 0){
                ret += tmp;
            }else if(mode==1 && i%2!=0){
                ret += tmp;
            }
        }
        return ret=="" ? "EMPTY":ret;
    }
}