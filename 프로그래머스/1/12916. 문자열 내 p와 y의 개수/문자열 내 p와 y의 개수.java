class Solution {
	boolean solution(String s) {
		boolean answer = true;

    int pcnt=0;
    int ycnt=0;
    s=s.toLowerCase();
    for (int i=0;i<s.length();i++){
        if(s.charAt(i) == 'p')
            pcnt++;
        else if(s.charAt(i) == 'y')
            ycnt++;
    }
    if(ycnt!=pcnt){
        answer = false;
    }
    return answer;
}

}