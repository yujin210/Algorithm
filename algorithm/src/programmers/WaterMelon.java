package programmers;

class Solution {
    public String solution(int n) {
        String answer = "";
        String pattern0 = "����";
        String pattern1 = "��";
        if(n%2==0)
            for(int i=1; i<=(n/2); i++)
                answer = answer.concat(pattern0);
        else
        {for(int i =1; i<=(n/2); i++){
                answer = answer.concat(pattern0);
            }
                answer = answer.concat(pattern1);}
        
        
        return answer;
    }
}